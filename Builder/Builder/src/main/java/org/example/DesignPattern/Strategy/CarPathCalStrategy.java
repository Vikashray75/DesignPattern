package org.example.DesignPattern.Strategy;

public class CarPathCalStrategy implements PathCalculator{
        private static CarPathCalStrategy instance;
    private CarPathCalStrategy()
    {

    }
    public static CarPathCalStrategy getInstance()
    {
        if(instance ==null)
        {
            synchronized (CarPathCalStrategy.class)
            {
                if(instance==null)
                    instance=new CarPathCalStrategy();
            }
        }
        return instance;
    }
    @Override
    public void findpath(String src, String dst) {
        System.out.println("Using Car Path for"+src +" to"+" "+dst);
    }
}
