package otus.java.basic.homework.lesson15.execute_method;

import java.util.ArrayList;


public class Enumeration {


    public ArrayList<Integer> count(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        return arrayList;
    }

    public ArrayList<Integer> change(int num, ArrayList<Integer> arr){
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            arr.set(i, num);
        }
        System.out.println(arr);
        return arr;
    }
}
