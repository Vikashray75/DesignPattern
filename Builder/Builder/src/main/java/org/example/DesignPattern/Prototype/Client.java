package org.example.DesignPattern.Prototype;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Student s1=new Student("vikash","v@gmail.com",29);
        System.out.println("debug");
        Student s2=new Student(s1);

        Student s3=getStudent();


    }
    private static Student getStudent()
    {
        Random random= new Random();
        int randomInt=random.nextInt();
        if(randomInt%2==0)
            return new Student("vikash","v@gmail.com",29);
        else
            return new InteligentStudent("vikash","v@gmail.com",30,100);
    }

}
