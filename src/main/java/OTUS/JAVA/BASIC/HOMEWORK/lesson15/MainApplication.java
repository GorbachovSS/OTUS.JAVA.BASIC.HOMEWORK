package otus.java.basic.homework.lesson15;

import otus.java.basic.homework.lesson15.execute_method.Enumeration;


import java.util.ArrayList;


public class MainApplication {

   
    public static void main(String[] args) throws InterruptedException {
//        MinMax minMax = new MinMax();
//        minMax.minMax(-10, 10);

//        SumElements sumElements = new SumElements();
//        sumElements.fillSumArray();

        Enumeration enumeration = new Enumeration();
        ArrayList<Integer> arr = enumeration.count(5);
        enumeration.change(5, arr);

    }
}
