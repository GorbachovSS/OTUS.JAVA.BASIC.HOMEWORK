package otus.java.basic.homework.lesson13.transport;

import otus.java.basic.homework.lesson13.Human;
import otus.java.basic.homework.lesson13.enums.Terrain;

public interface Transport {
    boolean moving(int distance, Terrain terrain);

    void sitDown(Human human);

    void standUp(Human human);
    String getNameTransport();
}
