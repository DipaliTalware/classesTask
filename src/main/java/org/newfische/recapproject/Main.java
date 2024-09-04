package org.newfische.recapproject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car();
        car1.carStarts();

        car1.speed =50;
        car1.carAccelerates(10);

        Car car2 = new Car();
        car2.speed = 30;
        car2.carAccelerates(20);

        Person person1 = new Person("Jane", 21,'F');
//        person1.name = "Jane";
//        person1.age = 21;
//        person1.gender = 'F';

        person1.personIntroduction();
    }
}