package otus.java.basic.homework.lesson15.execute_method;

import java.util.ArrayList;
import java.util.Random;

public class SumElements {
    Random random = new Random();

    public ArrayList<Integer> fillSumArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            arrayList.add(random.nextInt(20) / 2);
        }
        long intSum = arrayList.stream().mapToLong(Integer::longValue).filter(x -> x > 5).sum();
        System.out.println(intSum);

        System.out.println(arrayList);
        return arrayList;
    }
}
