package org.example;

public class Main {
    public static void main(String[] args) {
        Zoopark zoo = new Zoopark();
        zoo.addAnimal(new Cat("Vasya", 1, "Orange"))
                .addAnimal(new Dog("Rex", 2, "Black"))
                .addAnimal(new Duck("Donald", 3))
                .addAnimal(new Dolphin("Lucky", 11));
        for (Animal an : zoo.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("Voice of the zoopark:");

        for (Speakable speak : zoo.getSpeakables()) {
            System.out.println(speak.say());
        }

        System.out.println("Speed of run in the zoopark:");

        for (Runable runner : zoo.getRunables()) {
            System.out.println("Speed of run " + runner.speedOfRun());
        }

        int max = zoo.getChampionOfRunners();
        {
            System.out.println(String.format("Max of speed in the zoopark is %d", max));
        }
        System.out.println("Fly of the zoopark:");

        for (Flyable fly : zoo.getFlyables()) {
            System.out.printf("Speed of fly is: %d", +fly.speedOfFly());

        }

        System.out.println("\nSpeed of swim in the zoopark:");

        for (Swimable swim : zoo.getSwimables()) {
            System.out.println("Speed of swim is: " + swim.speedOfSwim());

        }

        int maxx = zoo.getChampionOfSwims();
        {
            System.out.println(String.format("Max of speed swim in the zoopark is %d", maxx));

        }
    }
}