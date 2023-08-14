package otus.java.basic.homework.lesson13;

import otus.java.basic.homework.lesson13.enums.Terrain;
import otus.java.basic.homework.lesson13.transport.Transport;

public class Human {
    private String name;
    private Transport currentTransport;


    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void moving(int distance, Terrain terrain) {
        if (this.getCurrentTransport() == null) {
            System.out.println(this.name + " идёт пешком!");
        } else {
            boolean ride = currentTransport.moving(distance, terrain);
            if (ride) {
                System.out.println(this.name + " проехал по " + terrain.getDescription() + " на " + currentTransport.getNameTransport());
            } else {
                System.out.println(this.name + " не смог проехать по " + terrain.getDescription() + " на " + currentTransport.getNameTransport());
            }
        }
    }
}
