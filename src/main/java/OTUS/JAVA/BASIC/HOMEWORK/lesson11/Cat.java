package otus.java.basic.homework.lesson11;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwimming) {
        super(name, speedRun, speedSwimming);
    }

    @Override
    public void run(int distance) {
        endurance = 100;
        int spend = 0;
        int timeOfAction;
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + " пробежал: " + i + " метр");
            if (endurance > 0) {
                endurance--;
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
