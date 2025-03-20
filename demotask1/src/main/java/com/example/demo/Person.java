package com.example.demo;

public class Person {
    private String name;
    private int age;
    private String address;
    public String getName() {
        return name;
    }
    public Person() { }
    public Person(String name, int age, String address) { // Constructor with parameters
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setAddress("San Francisco");
        System.out.println(person);
        //System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
