package otus.java.basic.homework.lesson15.execute_method;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MinMax {
    public ArrayList<Integer> minMax(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = min; i <= max; i+= 1) {
            arrayList.add(i);
            System.out.println(arrayList.toString());
        }
        return arrayList;
    }
}
