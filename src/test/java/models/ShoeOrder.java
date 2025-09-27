package models;

public class ShoeOrder {
    // | orderId   | customerName   | shippingAddress   |
    // billingAddress   | shoeModel   | quantity   | unitPrice
    // | subtotal   | taxRate   | taxAmount   | totalPrice   |
    // totalAmount   |
    private String orderId;
    private String customerName;
    private String shippingAddress;
    private String billingAddress;
    private String shoeModel;
    private int quantity;
    private double unitPrice;
    private double subtotal;
    private double taxRate;
    private double taxAmount;
    private double totalPrice;
    private double totalAmount;

    public ShoeOrder(String orderId, String customerName, String shippingAddress, String billingAddress, String shoeModel, int quantity, double unitPrice, double subtotal, double taxRate, double taxAmount, double totalPrice, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.shoeModel = shoeModel;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
        this.totalPrice = totalPrice;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public void setShoeModel(String shoeModel) {
        this.shoeModel = shoeModel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
