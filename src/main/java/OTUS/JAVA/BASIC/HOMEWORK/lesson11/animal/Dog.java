package otus.java.basic.homework.lesson11.animal;

public class Dog extends Animal {

    public Dog(String name, int speedRun, int speedSwim, int endures) {
        super(name, speedRun, speedSwim, endures);
    }

    public int swim(int distance) {
        int timeOfAction = super.swim(distance, 2);
        return timeOfAction;
    }
}

