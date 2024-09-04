package org.newfische.recapproject;
//If you like, also work on this optional bonus task.
//
//
//
//Class 'Person'
//Enter answer here
//
//Create a class 'Person' that contains properties like 'Name', 'Age', 'Gender', etc.
//
//Implement a method that introduces the person, for example, 'Hello, I am [Name] and [Age] years old.'
//
//Create objects of the class 'Person' for different individuals and call the introduction method.

public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void personIntroduction() {
        System.out.println("Hello, I am " + this.name + " and " + this.age + " years old.");
    }
}
