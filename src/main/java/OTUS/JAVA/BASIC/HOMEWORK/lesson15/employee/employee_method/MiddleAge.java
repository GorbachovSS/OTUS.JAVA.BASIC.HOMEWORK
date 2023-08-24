package otus.java.basic.homework.lesson15.employee.employee_method;

import java.util.ArrayList;

public class MiddleAge {
    public ArrayList<Integer> arrayList(ArrayList<Integer> arr, int midAge) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count += (arr.get(i)) / midAge;
        }
        System.out.println("Средний возрас сотрудников " + count);
        if (count > midAge) {
            System.out.println("Средний возраст сотрудников не превышает указанный аргумент");
        } else {
            System.out.println("Средний возраст сотрудников превышает указанный аргумент");
        }

        return arr;
    }
}
