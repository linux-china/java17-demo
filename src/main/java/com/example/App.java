package com.example;

public class App {

    public static void main(String[] args) {
        record Person(int id, String name) {
        }
        Person person = new Person(1, "leijuan");
        System.out.println("Hello " + person.name + "!");
    }
}
