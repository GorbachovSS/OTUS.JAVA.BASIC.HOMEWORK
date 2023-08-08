package otus.java.basic.homework.lesson11;

import otus.java.basic.homework.lesson11.animal.Cat;
import otus.java.basic.homework.lesson11.animal.Dog;
import otus.java.basic.homework.lesson11.animal.Horse;

public class MainApplication {
    public static void main(String[] args) {
        Dog dog = new Dog("Мила", 4, 2);
        dog.info();
        dog.run(500);
        System.out.println();
        dog.swim(500);
        dog.info();

        Cat cat = new Cat("Кузьмич", 6);
        cat.info();
        cat.run(500);
        System.out.println();
        cat.swim(500);
        cat.info();

        Horse horse = new Horse("Сахарок", 15, 10);
        horse.info();
        horse.run(500);
        System.out.println();
        horse.swim(500);
        horse.info();
    }
}
