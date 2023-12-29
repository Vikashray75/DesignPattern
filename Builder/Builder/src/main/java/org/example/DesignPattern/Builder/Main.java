package org.example.DesignPattern.Builder;

public class Main {
    public static void main(String[] args) throws Exception{
       // System.out.println("Hello world!");
        Student  sb=Student.getBuilder().setName("Vikash").setAge(19).setEmail("v@gmail.com").setPhone("12345313")
                .setUniversity("LPU").setPassoutYear("2016").build();


    }
}