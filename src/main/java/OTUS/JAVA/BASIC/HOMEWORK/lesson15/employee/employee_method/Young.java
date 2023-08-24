package otus.java.basic.homework.lesson15.employee.employee_method;

import java.util.ArrayList;


public class Young {

    public ArrayList<Integer> arrayList(ArrayList<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        for (Integer i : arr) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println("Минимальное возраст сотрудника: " + min);
        System.out.println("Максимальное возраст сотрудника: " + max);
        return arr;
    }
}
