package otus.java.basic.homework.lesson17;


import java.util.ArrayList;
import java.util.Collections;


public class List {
    public static void list()  {
        List list = new List();
        int i1 = 10;
        for (int i = 0; i < i1; i++) {
            list.notifyAll();
        }
        System.out.println(list);

    }
}
