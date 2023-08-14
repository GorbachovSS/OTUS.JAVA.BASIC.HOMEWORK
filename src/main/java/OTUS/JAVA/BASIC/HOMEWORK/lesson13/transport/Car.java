package otus.java.basic.homework.lesson13.transport;

import otus.java.basic.homework.lesson13.Human;
import otus.java.basic.homework.lesson13.enums.Terrain;

public class Car implements Transport{
    private Human human;
    private int petrol;

    public Car (int petrol) {
        this.petrol = petrol;
    }
    @Override
    public boolean moving(int distance, Terrain terrain) {
        if (terrain == Terrain.PLAIN && petrol >= distance) {
            return true;
        } else if (terrain == Terrain.SWAMP) {
            System.out.println("Машина не может ехать по болоту");
            return false;
        } else if (terrain == Terrain.DENSE_FOREST) {
            System.out.println("Машина не может ехать по лесу");
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void sitDown(Human human) {
        if (this.human == null) {
            if (human.getCurrentTransport() == null) {
                human.setCurrentTransport(this);
                this.human = human;
            } else {
                System.out.println("Человек уже сидит на " + human.getCurrentTransport());
            }
        } else {
            System.out.println("Лошадь уже занята человеком по имени " + this.human.getName());
        }
    }

    @Override
    public void standUp(Human human) {
        if (human.equals(this.human)) {
            human.setCurrentTransport(null);
            this.human = null;
        } else {
            System.out.println("Человек " + human.getName() + " не сидит на лошади");
        }
    }

    @Override
    public String getNameTransport() {
        return "Машина";
    }
}
