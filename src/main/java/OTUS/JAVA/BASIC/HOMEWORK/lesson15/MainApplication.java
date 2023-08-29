package otus.java.basic.homework.lesson15;

import otus.java.basic.homework.lesson15.employee.employee_method.MiddleAge;
import otus.java.basic.homework.lesson15.employee.employee_method.ReturnListEmployee;
import otus.java.basic.homework.lesson15.employee.employee_method.ReturnName;
import otus.java.basic.homework.lesson15.employee.employee_method.Young;
import otus.java.basic.homework.lesson15.execute_method.Enumeration;
import otus.java.basic.homework.lesson15.execute_method.Increase;
import otus.java.basic.homework.lesson15.execute_method.MinMax;
import otus.java.basic.homework.lesson15.execute_method.SumElements;


import java.util.ArrayList;


public class MainApplication {


    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        minMax.minMax(-10, 10);

        SumElements sumElements = new SumElements();
        sumElements.fillSumArray();

        Enumeration enumeration = new Enumeration();
        ArrayList<Integer> arr = enumeration.count(5);
        enumeration.change(5, arr);

        Increase increase = new Increase();
        ArrayList<Integer> arr2 = increase.count(5);
        increase.increase(1, arr2);

        ReturnName returnName = new ReturnName();
        returnName.arrName(new ArrayList<>());
        returnName.arrAge(new ArrayList<>());
        ReturnName.print();

        ReturnListEmployee returnListEmployee = new ReturnListEmployee();
        returnListEmployee.minAge(returnName.arrAge(new ArrayList<>()), 20);
        System.out.println();

        MiddleAge middleAge = new MiddleAge();
        middleAge.arrayList(returnName.arrAge(new ArrayList<>()), 5);

        Young young = new Young();
        young.arrayList(returnName.arrAge(new ArrayList<>()));
    }
}
