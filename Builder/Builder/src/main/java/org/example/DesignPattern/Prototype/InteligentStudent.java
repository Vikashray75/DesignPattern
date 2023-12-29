package org.example.DesignPattern.Prototype;

public class InteligentStudent extends Student{
    int iq;
    public InteligentStudent(String name, String email, int age,int iq) {
        super(name, email, age);
        this.iq=iq;
    }

    public InteligentStudent(InteligentStudent inteligentStudent) {
        super(inteligentStudent);
        this.iq=inteligentStudent.iq;
    }
}
