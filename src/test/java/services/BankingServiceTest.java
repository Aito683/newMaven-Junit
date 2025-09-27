package services;

import models.BankAccount;
import models.Customer;
import models.Transaction;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankingServiceTest {
    //when you see lines of code that are repeating in every single
    //test within one test class
    //those lines are good candidates to be moved
    //@beforeEach , @beforeAll, @afterAll, @afterEach--> these are called hooks
    // are pre conditional steps
    static BankingServiceClass bankingServiceClass;
    BankAccount bankAccount1 ;
    Customer customer1 ;
    @BeforeAll
    public static void beforeAll(){
        bankingServiceClass = new BankingServiceClass();
    }

    @BeforeEach
    public void setupEachTest(){
        // are pre conditional steps

       bankAccount1 = new BankAccount("12345", 1000.0);
       customer1 = new Customer("Elon Musk","x1",bankAccount1);
    }

    @AfterEach
    public void cleanUp(){
        //start every test from empty cache
        //so that it ensures each test is starting from of app's default state
        //and each test is independent of each other
        bankingServiceClass.clearCache();
    }
    @Test
    public void addNewCostumerTest(){

        //this is action test
        bankingServiceClass.addCustomer(customer1);

        List<Customer> expectedListOfCustomers = new ArrayList<>();
        expectedListOfCustomers.add(customer1);

        assertEquals(expectedListOfCustomers,bankingServiceClass.getCustomerList(),"two customer lists are not equal");


    }
    @Test
    public void findingCustomerWithin1CustomerListTest(){
        bankingServiceClass.addCustomer(customer1);

        Customer actualResultCustomerObj = bankingServiceClass.findCustomer("x1");

        Assertions.assertEquals("Elon Musk", actualResultCustomerObj.getName());
    }
    @Test
    public void findingCustomerThatDoesntExist(){
        bankingServiceClass.addCustomer(customer1);

        Customer actualResultCustomerObj = bankingServiceClass.findCustomer("beta123");

        assertNull(actualResultCustomerObj,"finding a customer that doesn't exist should return null");


    }
    @Test
    public void performTransactionWithNullAccount(){
        Transaction transaction = new Transaction("TXN0001","Deposit",500.0,"0001","x1");
        try {
            assertThrows(Exception.class,() -> bankingServiceClass.performTransaction(transaction));

        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void performTransactionWithNullCustomer(){
        Transaction transaction = new Transaction("TXN0001","Deposit",500.0,"0001","beta2");

        try{
            assertThrows(Exception.class, () -> bankingServiceClass.performTransaction(transaction));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void testPerformDepositTransaction(){

        Transaction transaction = new Transaction("TXN0001","Deposit",500.0,"12345","x1");

bankingServiceClass.addCustomer(customer1);
try{
    bankingServiceClass.performTransaction(transaction);

    assertEquals(1500.00, bankAccount1.getBalance(),"Deposit is not completed");
}catch(Exception e ){
    fail("Perform transaction with a valid transaction name failed");
}
    }
    @Test
    public void testPerformWithdrawWithSufficientFunds(){

        bankingServiceClass.addCustomer(customer1);
        Transaction transaction = new Transaction("TXN0001","Withdraw",300.0,"12345","x1");

        try{
            bankingServiceClass.performTransaction(transaction);
            assertEquals(700.0, bankAccount1.getBalance(),"withdraw balance mismatch");

        }catch (Exception e ){
            fail("Withdraw with sufficient funds is not completed"+e.getMessage());
        }
    }
    @Test
    public void testPerformWithdrawWithInsufficientFunds(){

        bankingServiceClass.addCustomer(customer1);
        Transaction transaction = new Transaction("TXN0001","Withdraw",1500.0,"12345","x1");

        try{
            bankingServiceClass.performTransaction(transaction);
            assertEquals(1000.0, bankAccount1.getBalance(),"withdraw balance mismatch");

        }catch (Exception e ){
            fail("Withdraw with insufficient funds is not completed"+e.getMessage());
        }

    }

}
