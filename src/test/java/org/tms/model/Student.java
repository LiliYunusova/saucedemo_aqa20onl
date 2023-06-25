package org.tms.model;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private boolean correspondenceStudent;
    private String phoneNumber;
    private String country;

    public Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.correspondenceStudent = builder.correspondenceStudent;
        this.phoneNumber = builder.phoneNumber;
        this.country = builder.country;
    }

    public static class StudentBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private boolean correspondenceStudent;
        private String phoneNumber;
        private String country;

        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }

        public StudentBuilder correspondenceStudent(boolean correspondenceStudent){
            this.correspondenceStudent = correspondenceStudent;
            return this;
        }
        public StudentBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public StudentBuilder country(String country){
            this.country = country;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
