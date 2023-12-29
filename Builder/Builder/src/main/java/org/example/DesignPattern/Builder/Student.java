package org.example.DesignPattern.Builder;

public class Student {
    String name;
    int age;
    String email;
    String phone;
    String university;
    String passoutYear;

    public static Builder getBuilder()
    {
        Builder builder=new Builder();
        return builder;
    }

    Student(Builder builder)
    {
        this.name=builder.name;
        this.age=builder.age;
        this.email=builder.email;
        this.phone=builder.phone;
        this.university=builder.university;
        this.passoutYear=builder.passoutYear;
    }

    public static class Builder
    {
        String name;
        int age;
        String email;
        String phone;
        String university;
        String passoutYear;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setPassoutYear(String passoutYear) {
            this.passoutYear = passoutYear;
            return this;
        }

        public Student build() throws Exception
        {
            if(this.age<18)
            {
                throw new Exception("Age is less then 18");
            }
            return new Student(this);
        }
    }
}
