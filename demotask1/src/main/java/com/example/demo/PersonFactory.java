package com.example.demo;

public class PersonFactory {
    public static Person createDefaultPerson() {
        return new Person("Default Name", 30, "Default Address");
    }

    public static Student createDefaultStudent() {
        return new Student("Default Student", 20, "Default Address", "STU12345");
    }
}

