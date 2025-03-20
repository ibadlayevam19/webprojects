package com.example.demo;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String address, String studentId) {
        super();  // Calls the constructor of `Person`
        this.setName(name);
        this.setAge(age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
}

