package otus.java.basic.homework.lesson11;

public class Animal {
    String name;
    int speedRun;
    int speedSwimming;
    int endurance;
    int spend;
    int timeOfAction;

    public Animal(String name, int speedRun, int speedSwimming) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwimming = speedSwimming;
        this.endurance = 100;
    }

    public void run(int distance) {

    }

    public void swim(int distance) {

    }

    public void initAction() {
        this.endurance = 100;
        this.spend = 0;
        this.timeOfAction = 0;
    }

    public void info() {
        System.out.println("Имя: " + name + "\n"
                + "Скорость бега: " + speedRun + "\n"
                + "Скорость плавания: " + speedSwimming + "\n"
                + "Выносливость: " + endurance + "\n");
    }
}
