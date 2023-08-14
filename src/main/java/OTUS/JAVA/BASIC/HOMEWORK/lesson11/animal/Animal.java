package otus.java.basic.homework.lesson11.animal;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int speedSwim;
    protected int endurance;

    public Animal(String name, int speedRun, int speedSwim, int endures) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endures;
    }

    public int run(int distance) {
        int timeOfAction = 0;
        if (endurance >= distance) {
            endurance -= distance;
            timeOfAction = distance / speedRun;
            System.out.println(name + " пробежал " + distance + " метров за " + timeOfAction + " м/c");
        } else if (endurance < distance) {
            System.out.println(name + " не смог пробежать " + distance + " метров у него осталось " + endurance + " выносливости! Необходимо " + distance);
            return -1;
        }
        return timeOfAction;
    }

    public int swim(int distance, int staminaCost) {
        int timeOfAction = 0;
        if (endurance / staminaCost >= distance) {
            endurance -= distance * staminaCost;
            timeOfAction = distance / speedSwim;
            System.out.println(name + " проплыл " + distance + " метров за " + timeOfAction + " м/c");
        } else if (endurance < distance) {
            System.out.println(name + " не смог проплыть " + distance + " метров у него осталось " + endurance + " выносливости! Необходимо " + distance);
            return -1;
        }
        return timeOfAction;
    }


    public void info() {
        System.out.println(
                "Имя: " + name + "\n" +
                        "Скорость бега: " + speedRun + "\n" +
                        "Скорость плавания: " + speedSwim + "\n" +
                        "Выносливость: " + endurance);
    }
}
