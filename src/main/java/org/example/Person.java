package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double tall;
    boolean isMarried;
    double weight;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double tall,boolean isMarried, double weight) {
        this(firstName, lastName, age);
        this.tall = tall;
        this.isMarried = isMarried;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return this.age>13 && this.age<=19;
    }
}
