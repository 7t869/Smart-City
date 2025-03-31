package com;

class Citizen {
    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Citizen: " + name + ", Age: " + age);
    }
}
