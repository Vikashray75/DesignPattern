package org.example.DesignPattern.Strategy;

public class WalkPathCalStrategy implements PathCalculator{
    private static WalkPathCalStrategy instance;

    private WalkPathCalStrategy() {
    }
    public static WalkPathCalStrategy getInstance()
    {
        if(instance==null)
        {
            synchronized (WalkPathCalStrategy.class)
            {
                if(instance==null)
                    instance =new WalkPathCalStrategy();
            }
        }
        return instance;
    }


    @Override
    public void findpath(String src, String dst) {
        System.out.println("Walk Path from "+src+" to"+ dst);
    }
}
