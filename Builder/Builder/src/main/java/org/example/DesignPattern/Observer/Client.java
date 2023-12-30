package org.example.DesignPattern.Observer;

public class Client {
    public static void main(String[] args) {
        Amazon amazon=Amazon.getInstance();
        InventoryService inventoryService=new InventoryService();
        InvoiceService invoiceService=new InvoiceService();
        amazon.orderPlaced();
    }
}
