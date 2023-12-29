package org.example.DesignPattern.Factory;

public class CasualShoeFactory implements ShoeFactory{

    @Override
    public Shoe makeShoe() {
        return new CasualShoe();
    }
}
