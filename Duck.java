package org.example;

public class Duck extends Animal implements Runable,Flyable,Swimable {
    public Duck(String name, int cell) {
        super(name, cell);
    }

    @Override
    public String say() {
        return "Кря-Кря";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    @Override
    public int speedOfRun(){
        return 7;
    }
    @Override
    public int speedOfFly() {
        return 30;
    }
    @Override
    public int speedOfSwim() {
        return 15;
    }
}
