package org.example.DesignPattern.Factory;

public class SneakerFactory implements ShoeFactory{

    @Override
    public Shoe makeShoe() {
        return new Sneakers();
    }
}
