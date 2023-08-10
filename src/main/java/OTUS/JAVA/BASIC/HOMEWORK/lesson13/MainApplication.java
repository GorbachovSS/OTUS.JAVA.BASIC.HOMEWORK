package otus.java.basic.homework.lesson13;


import otus.java.basic.homework.lesson13.enums.Terrain;
import otus.java.basic.homework.lesson13.transport.Bicycle;
import otus.java.basic.homework.lesson13.transport.Car;
import otus.java.basic.homework.lesson13.transport.EverywhereRunning;
import otus.java.basic.homework.lesson13.transport.Horse;

public class MainApplication {
    public static void main(String[] args) {
        Human ss = new Human("Сергей");
//        Human dd = new Human("Денис");

        Horse horse = new Horse(10);
        horse.sitDown(ss);
        ss.moving(5, Terrain.PLAIN);
        ss.moving(5, Terrain.SWAMP);
        ss.moving(15, Terrain.PLAIN);
        ss.moving(5, Terrain.DENSE_FOREST);
        horse.standUp(ss);

        System.out.println("----------------------------------------");

        Car car = new Car(10);
        car.sitDown(ss);
        ss.moving(5, Terrain.PLAIN);
        ss.moving(5, Terrain.SWAMP);
        ss.moving(15, Terrain.PLAIN);
        ss.moving(5, Terrain.DENSE_FOREST);
        car.standUp(ss);

        System.out.println("----------------------------------------");

        EverywhereRunning everywhereRunning = new EverywhereRunning(10);
        everywhereRunning.sitDown(ss);
        ss.moving(5, Terrain.PLAIN);
        ss.moving(5, Terrain.SWAMP);
        ss.moving(15, Terrain.PLAIN);
        ss.moving(5, Terrain.DENSE_FOREST);
        everywhereRunning.standUp(ss);

        System.out.println("----------------------------------------");

        Bicycle bicycle = new Bicycle();
        bicycle.sitDown(ss);
        ss.moving(5, Terrain.PLAIN);
        ss.moving(5, Terrain.SWAMP);
        ss.moving(15, Terrain.PLAIN);
        ss.moving(5, Terrain.DENSE_FOREST);
        bicycle.standUp(ss);

        System.out.println("----------------------------------------");

        ss.moving(10, Terrain.PLAIN);
    }
}
