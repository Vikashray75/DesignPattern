package org.example.DesignPattern.Strategy;

import org.example.DesignPattern.Strategy.Factory.Mode;

public class Client {
    public static void main(String[] args) {
        Map map=new Map();
        map.findPath("Delhi","Kolkata", Mode.BIKE);
    }
}
