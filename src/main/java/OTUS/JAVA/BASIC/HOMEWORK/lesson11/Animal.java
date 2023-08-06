package otus.java.basic.homework.lesson11;

public class Animal {
    String name;
    int speedRun;
    int speedSwimming;
    int endurance;

    public Animal(String name, int speedRun, int speedSwimming) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwimming = speedSwimming;
    }


    public void run(int distance) {

    }

    public void swim(int distance) {

    }

    public void info() {
        System.out.println("Имя: " + name + "\n"
                + "Скорость бега: " + speedRun + "\n"
                + "Скорость плавания: " + speedSwimming + "\n"
                + "Выносливость: " + endurance + "\n");
    }

}
