package otus.java.basic.homework.lesson24;
import lombok.*;


@Data
public class Fruit {
    private String name;
    private double weight;

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
