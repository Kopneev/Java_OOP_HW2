package org.example;

public abstract class Animal implements Speakable{
    private String name;
    private int cell;

    public Animal(String name, int cell) {
        this.name = name;
        this.cell = cell;
    }

    @Override
    public String toString() {
        return String.format("name is %s cell num: %d", this.name, this.cell);
    }

    public abstract String say();
}
