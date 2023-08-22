package otus.java.basic.homework.lesson15.execute_method;

import java.util.ArrayList;


public class Enumeration {


    public static void count (int number, ArrayList<Integer> array){
        for (int i = 1; i < 6; i++) {
            array.add(i);
        }
        System.out.println(array);


    }

}
