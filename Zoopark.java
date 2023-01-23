package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoopark {
    private ArrayList<Animal> animals;

    private Radio radio = new Radio();

    public Zoopark() {
        animals = new ArrayList<Animal>();
    }

    public Zoopark addAnimal(Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakable> getSpeakables() {
        List<Speakable> result = new ArrayList<Speakable>();
        for (Animal an : animals) {
            result.add(an);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunables() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable) an);
            }
        }
        return result;
    }

    public int getChampionOfRunners() {
        int max = 0;
        for (Runable result : getRunables()) {
            if (max < result.speedOfRun()) {
                max = result.speedOfRun();
            }
        }
        return max;
    }

    public List<Flyable> getFlyables() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable) an);
            }
        }
        return result;
    }

    public List<Swimable> getSwimables() {
        List<Swimable> result = new ArrayList<Swimable>();
        for (Animal an : animals) {
            if (an instanceof Swimable) {
                result.add((Swimable) an);
            }
        }
        return result;
    }


    public int getChampionOfSwims() {
        int maxx = 0;
        for (Swimable result : getSwimables()) {
            if (maxx < result.speedOfSwim()) {
                maxx = result.speedOfSwim();
            }
        }
        return maxx;
    }


    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
