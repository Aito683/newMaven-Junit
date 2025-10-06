package steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.bs.A;
import models.*;

import java.util.Map;

public class DataTableTransformer {

    @DataTableType
    public Order orderEntry(Map<String, String> entry) {
        int orderId = Integer.valueOf(entry.get("orderID"));
        String product = entry.get("product");
        int quantity = Integer.valueOf(entry.get("quantity"));
        return new Order(orderId, product, quantity);
    }

    @DataTableType
    public Hotel hotelEntry(Map<String, String> hotels) {
        String name = hotels.get("hotelName");
        String location = hotels.get("location");
        int rating = Integer.valueOf(hotels.get("starRating"));
        //List<String> roomTypes = Arrays.asList(hotels.get("roomTypes").split(","));
        String roomTypes = hotels.get("roomTypes");
        double avgGuestRating = Double.parseDouble(hotels.get("avgGuestRating"));
        return new Hotel(name, location, rating, roomTypes, avgGuestRating);
    }

    @DataTableType
    public EmailType emailTypeEntry(Map<String, String> entry) {
        String emailType = entry.get("emailType");
        String description = entry.get("description");
        return new EmailType(emailType, description);
    }

    @DataTableType
    public EmailAutomationSetting settingsEntry(Map<String, String> entry) {

        String type = entry.get("emailType");
        String frequency = entry.get("scheduleFrequency");
        String sendTime = entry.get("sendTime");
        return new EmailAutomationSetting(type, frequency, sendTime);
    }

    @DataTableType
    public Employee employeeEntry(Map<String, String> entry) {
        int id = Integer.valueOf(entry.get("employeeID"));
        String name = entry.get("firstName");
        String lastname = entry.get("lastName");
        String department = entry.get("department");
        String position = entry.get("position");
        String salary = entry.get("salary");

        return new Employee(id, name, lastname, department, position, salary);
    }

    @DataTableType
    public Claim claimEntry(Map<String, String> entry) {
        String claimId = entry.get("claimId");
        double amount = Double.valueOf(entry.get("amount"));
        String date = entry.get("date");
        String description = entry.get("description");
        String supportingDoc = entry.get("supportingDocuments");

        return new Claim(claimId, amount, date, description, supportingDoc);

    }

    @DataTableType
    public Invoice invoiceEntry(Map<String, String> entry) {
        // | orderId | customerName | shippingAddress | billingAddress
        // | productName | quantity | unitPrice | subtotal | taxRate | taxAmount | totalAmount |
        String orderId = entry.get("orderId");
        String customer = entry.get("customerName");
        String shipAddress = entry.get("shippingAddress");
        String billAddress = entry.get("billingAddress");
        String product = entry.get("productName");

        int quantity = parseIntSafe(entry.get("quantity"));
        double unitPrice = parseDoubleSafe(entry.get("unitPrice"));
        double subtotal = parseDoubleSafe(entry.get("subtotal"));
        double taxRate = parseDoubleSafe(entry.get("taxRate"));
        double taxAmount = parseDoubleSafe(entry.get("taxAmount"));
        double totalAmount = parseDoubleSafe(entry.get("totalAmount"));

        return new Invoice(orderId, customer, shipAddress, billAddress, product,
                quantity, unitPrice, subtotal, taxRate, taxAmount, totalAmount);
    }

    private int parseIntSafe(String value) {
        return (value == null || value.isBlank()) ? 0 : Integer.parseInt(value);
    }

    private double parseDoubleSafe(String value) {
        return (value == null || value.isBlank()) ? 0.0 : Double.parseDouble(value);
    }

    @DataTableType
    public ShoeOrder entryShoeOrder(Map<String, String> entry) {
        String orderId = entry.get("orderId");
        String customerName = entry.get("customerName");
        String shippingAddress = entry.get("shippingAddress");
        String billingAddress = entry.get("billingAddress");
        String shoeModel = entry.get("shoeModel");
        int quantity = Integer.parseInt(entry.get("quantity"));
        double unitPrice = Double.parseDouble(entry.get("unitPrice"));
        double subtotal = Double.parseDouble(entry.get("subtotal"));
        double taxRate = Double.parseDouble(entry.get("taxRate"));
        double taxAmount = Double.parseDouble(entry.get("taxAmount"));
        double totalPrice = Double.parseDouble(entry.get("totalPrice"));
        double totalAmount = Double.parseDouble(entry.get("totalAmount"));

        // Use constructor instead of setters
        return new ShoeOrder(orderId, customerName, shippingAddress, billingAddress,
                shoeModel, quantity, unitPrice, subtotal,
                taxRate, taxAmount, totalPrice, totalAmount);
    }

    @DataTableType
    public AccountCard accountCardEntry(Map<String, String> entry) {
        String accountName = entry.get("accountName");
        String accountType = entry.get("accountType");
        String ownership = entry.get("ownership");
        long accountNumber = Long.valueOf(entry.get("accountNumber"));
        String interestRate = entry.get("interestRate");
        double balance = Double.parseDouble(entry.get("balance"));

        return new AccountCard(accountName, accountType, ownership, accountNumber, interestRate, balance);

    }
}
