package org.example;

public class Dog extends Animal implements Runable,Swimable{

    private String color;

    public Dog(String name, int cell, String color) {
        super(name, cell);
        this.color = color;
    }

    @Override
    public String say() {
        return "Гавв";
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }

    @Override
    public int speedOfRun(){
        return 18;
    }
    @Override
    public int speedOfSwim() {
        return 10;
    }
}
