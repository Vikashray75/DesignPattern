package org.example.DesignPattern.Observer;

public class InvoiceService implements OrderPlaceSubscriber{

    public InvoiceService() {
        Amazon a=Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orerPlacedEvent() {
        ReturnData data=new ReturnData("Invoice is generating");
        System.out.println("Invoice is being Generated");
        return data;
    }
}
