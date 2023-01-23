package org.example;

public class Dolphin extends Animal implements Speakable, Swimable {

    public Dolphin(String name, int cell) {
        super(name, cell);
    }

    @Override
    public String say() {
        return "what";
    }

    @Override
    public String toString() {
        return "Dolphin" + super.toString();
    }

    @Override
    public int speedOfSwim() {
        return 65;
    }
}
