package otus.java.basic.homework.lesson15;

import otus.java.basic.homework.lesson15.execute_method.Enumeration;
import otus.java.basic.homework.lesson15.execute_method.MinMax;
import otus.java.basic.homework.lesson15.execute_method.SumElements;

import java.util.ArrayList;


public class MainApplication {

   
    public static void main(String[] args) throws InterruptedException {
//        MinMax minMax = new MinMax();
//        minMax.minMax(-10, 10);

//        SumElements sumElements = new SumElements();
//        sumElements.fillSumArray();

        Enumeration enumeration = new Enumeration();
        Enumeration.count(5, new ArrayList<>());
    }
}
