package com.solvd.rentalcompany.classes;

public class Person {
    public String name;
    public String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "[" + name + " " + lastName + "]";
    }
}