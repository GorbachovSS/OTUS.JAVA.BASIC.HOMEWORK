package otus.java.basic.homework.lesson12;

public class MainApplication {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Толя", 5),
                new Cat("Саня", 3),
                new Cat("Петя", 3)
        };

        Plate plate = new Plate(10, 10);
        System.out.println(plate);
        System.out.println("-----------------------------------------");

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].toString());
        }
        System.out.println("-----------------------------------------");
        System.out.println(plate);
    }
}
