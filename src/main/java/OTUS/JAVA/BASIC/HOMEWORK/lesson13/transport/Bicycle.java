package otus.java.basic.homework.lesson13.transport;

import otus.java.basic.homework.lesson13.Human;
import otus.java.basic.homework.lesson13.enums.Terrain;

public class Bicycle implements Transport {
    private Human human;


    @Override
    public boolean moving(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
        return true;
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
        return "Велосипед";
    }
}
