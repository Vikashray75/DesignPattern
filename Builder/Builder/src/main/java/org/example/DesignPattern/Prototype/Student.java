package org.example.DesignPattern.Prototype;

public class Student {
    String name;
    String email;
    int age;

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(Student original)
    {
        this.name=original.name;
        this.age=original.age;
        this.email=original.email;
    }
}
