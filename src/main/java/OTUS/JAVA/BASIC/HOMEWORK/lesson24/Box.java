package otus.java.basic.homework.lesson24;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits;

    public Box(ArrayList<T> fruit) {
        fruits = fruit;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        return fruits.stream()
                .mapToDouble(Fruit::getWeight)
                .sum();
    }

    public boolean compareToBoxWeight(Box<T> other) {
        return this.weight() == other.weight();
    }

    public void transferTo(Box<T> otherBox) {
        for (Fruit fruit : fruits) {
            otherBox.addFruit((T) fruit);
        }
    }
}
