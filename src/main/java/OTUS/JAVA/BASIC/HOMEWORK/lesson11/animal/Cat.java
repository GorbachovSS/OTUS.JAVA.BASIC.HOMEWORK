package otus.java.basic.homework.lesson11.animal;

import otus.java.basic.homework.lesson11.Animal;

public class Cat extends Animal {
    public Cat(String name, int speedRun) {
        super(name, speedRun, 0);
    }

    @Override
    public void run(int distance) {
        super.initAction();

        for (int i = 1; i <= 100; i++) {
            System.out.println(name + " пробежал: " + i + " метр");
            endurance--;
            if (endurance > 0) {
                ++spend;

                System.out.println(name + " потратил " + spend + " Выносливость");
            } else {
                System.out.println(name + " устал");
                break;
            }
        }

        timeOfAction = distance / speedRun;
        System.out.println("Время за которое кот устал при беге: " + timeOfAction + " секунд");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот плавать не умеет.");
    }
}
