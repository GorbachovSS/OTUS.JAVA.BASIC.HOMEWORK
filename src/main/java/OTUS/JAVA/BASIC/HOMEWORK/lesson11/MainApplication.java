package otus.java.basic.homework.lesson11;

import otus.java.basic.homework.lesson11.animal.Cat;
import otus.java.basic.homework.lesson11.animal.Dog;
import otus.java.basic.homework.lesson11.animal.Horse;

public class MainApplication {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 2, 1, 10);
        dog.info();
        dog.run(10);
        dog.swim(10);
        System.out.println();
        dog.info();
        System.out.println();

        Cat cat = new Cat("Барсик", 2, 10);
        cat.info();
        cat.run(10);
        cat.swim(10);
        System.out.println();
        cat.info();
        System.out.println();

        Horse horse = new Horse("Сахарок", 4, 2,30);
        horse.info();
        horse.run(10);
        horse.swim(4);
        System.out.println();
        horse.info();
    }
}
