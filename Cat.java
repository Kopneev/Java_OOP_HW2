package org.example;

public class Cat extends Animal implements Runable,Swimable{
    private String color;

    public Cat(String name, int cell, String color) {
        super(name, cell);
        this.color = color;
    }

    @Override
    public String say() {
        return "Мяуу";
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }

    @Override
    public int speedOfRun(){
        return 15;
    }
    @Override
    public int speedOfSwim() {
        return 5;
    }


}
