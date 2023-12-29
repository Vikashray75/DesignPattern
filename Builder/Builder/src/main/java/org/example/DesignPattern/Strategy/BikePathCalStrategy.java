package org.example.DesignPattern.Strategy;

public class BikePathCalStrategy implements PathCalculator{

    private static BikePathCalStrategy instance;

    private BikePathCalStrategy() {
    }
    public static BikePathCalStrategy getInstance()
    {
        if(instance==null)
        {
            synchronized (BikePathCalStrategy.class)
            {
                if(instance==null)
                    instance =new BikePathCalStrategy();
            }
        }
        return instance;
    }


    @Override
    public void findpath(String src, String dst) {
        System.out.println("Bike Path from "+src+" to"+ dst);
    }
}
