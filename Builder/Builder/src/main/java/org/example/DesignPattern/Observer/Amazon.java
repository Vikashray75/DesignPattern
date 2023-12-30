package org.example.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
 private List<OrderPlaceSubscriber> subscribers;
 private static Amazon instance;
 public static Amazon getInstance()
 {
     if(instance==null)
     {
         instance =new Amazon();
     }
     return instance;
 }

    private Amazon() {
        this.subscribers = new ArrayList<>();

    }
    public void orderPlaced()
    {
        for(OrderPlaceSubscriber orderPlaceSubscriber:subscribers)
        {
            orderPlaceSubscriber.orerPlacedEvent();
        }
    }

    public void registerOrderPlacedSubscriber(OrderPlaceSubscriber orderPlaceSubscriber)
    {
        subscribers.add(orderPlaceSubscriber);
    }
    public void UnregisterOrderPlacedSubscriber(OrderPlaceSubscriber orderPlaceSubscriber)
    {
        subscribers.remove(orderPlaceSubscriber);
    }



}
