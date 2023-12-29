package org.example.DesignPattern.Factory;

public class Client {
    public static void main(String[] args) {
        ShoeFactory sneakerFactory=new SneakerFactory();
        Shoe sneaker1 = sneakerFactory.makeShoe();
        sneaker1.ammend();

        ShoeFactory casualShoeFactory=new CasualShoeFactory();
        Shoe CasualShoe1=casualShoeFactory.makeShoe();
        CasualShoe1.ammend();
    }
}
