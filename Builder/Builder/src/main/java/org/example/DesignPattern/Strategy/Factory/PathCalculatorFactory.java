package org.example.DesignPattern.Strategy.Factory;

import org.example.DesignPattern.Strategy.BikePathCalStrategy;
import org.example.DesignPattern.Strategy.CarPathCalStrategy;
import org.example.DesignPattern.Strategy.PathCalculator;
import org.example.DesignPattern.Strategy.WalkPathCalStrategy;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(Mode mode)
    {
        return switch (mode)
        {
            case CAR -> CarPathCalStrategy.getInstance();
            case BIKE -> BikePathCalStrategy.getInstance();
            case WALK -> WalkPathCalStrategy.getInstance();
        };
    }

}
