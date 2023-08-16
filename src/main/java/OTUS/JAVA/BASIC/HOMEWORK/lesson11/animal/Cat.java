package otus.java.basic.homework.lesson11.animal;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int endures, int staminaCost) {

        super(name, speedRun, 0, endures, staminaCost);
    }

    public int swim(int distance) {
        System.out.println("Кот плавать не умеет");
        return -1;
    }

}