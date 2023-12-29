package org.example.DesignPattern.Strategy;

import org.example.DesignPattern.Strategy.Factory.Mode;
import org.example.DesignPattern.Strategy.Factory.PathCalculatorFactory;

public class Map {
    void findPath(String src,String dst,Mode mode)
    {
        PathCalculator pathCalculator= PathCalculatorFactory.getPathCalculator(Mode.BIKE);
         pathCalculator.findpath(src,dst);

    }
}
