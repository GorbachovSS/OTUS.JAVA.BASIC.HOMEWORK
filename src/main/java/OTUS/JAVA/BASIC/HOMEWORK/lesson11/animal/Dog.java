package otus.java.basic.homework.lesson11.animal;

import otus.java.basic.homework.lesson11.Animal;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwimming) {
        super(name, speedRun, speedSwimming);
    }

    @Override
    public void run(int distance) {
        super.initAction();

        for (int i = 1; i <= 100; i++) {

            System.out.println(name + " пробежал: " + i + " метр");
            endurance--;

            if (endurance > 0) {
                spend++;
                System.out.println(name + " потратил " + spend + " Выносливость");
            } else {
                System.out.println(name + " устал");
                break;
            }
        }

        timeOfAction = distance / speedRun;
        System.out.println("Время за которое собака устала при беге: " + timeOfAction + " секунд");
    }

    @Override
    public void swim(int distance) {
        super.initAction();

        for (int i = 1; i <= 100; i++) {

            System.out.println(name + " проплыл: " + i + " метр");
            if (endurance > 0) {
                endurance -= 2;
                spend += 2;

                System.out.println(name + " потратил " + spend + " Выносливость");
            } else {
                System.out.println(name + " устал");
                break;
            }

        }

        timeOfAction = distance / speedSwimming;
        System.out.println("Время за которое собака устала при плавание: " + timeOfAction + " секунд");
    }

}