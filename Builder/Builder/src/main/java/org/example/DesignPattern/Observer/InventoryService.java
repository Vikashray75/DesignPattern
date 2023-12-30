package org.example.DesignPattern.Observer;

public class InventoryService implements OrderPlaceSubscriber{

    public InventoryService() {
        Amazon a=Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orerPlacedEvent() {
        ReturnData data=new ReturnData("Inventory");
        System.out.println("Inventory is being generated");
        return data;
    }
}
