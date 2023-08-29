package otus.java.basic.homework.lesson15.execute_method;

import java.util.ArrayList;

public class Increase {

    public ArrayList<Integer> count(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        return arrayList;
    }


    public ArrayList<Integer> increase(int num, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + num);
        }
        System.out.println(arr);
        return arr;
    }
}
