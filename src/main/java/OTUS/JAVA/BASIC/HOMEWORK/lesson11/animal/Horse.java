package otus.java.basic.homework.lesson11.animal;

public class Horse extends Animal{

    public Horse(String name, int speedRun, int speedSwim, int endures) {
        super(name, speedRun, speedSwim, endures);
    }

    public int swim(int distance) {

        int  timeOfAction = super.swim(distance, 4);
        return timeOfAction;
    }
}
