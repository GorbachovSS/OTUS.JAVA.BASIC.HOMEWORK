package otus.java.basic.homework.lesson15.employee.employee_method;

import java.util.ArrayList;


public class ReturnListEmployee {

    public ArrayList<Integer> minAge(ArrayList<Integer> arrName, int age) {
        ReturnName returnName = new ReturnName();
        returnName.arrName(new ArrayList<>());
        returnName.arrAge(new ArrayList<>());

        if (arrName.get(0) >= age) {
            System.out.println(returnName.arrName(new ArrayList<>()).get(0) + returnName.arrAge(new ArrayList<>()).get(0) + " лет");
        }
        if (arrName.get(1) >= age) {
            System.out.println(returnName.arrName(new ArrayList<>()).get(1) + returnName.arrAge(new ArrayList<>()).get(1) + " лет");
        }
        if (arrName.get(2) >= age) {
            System.out.println(returnName.arrName(new ArrayList<>()).get(2) + returnName.arrAge(new ArrayList<>()).get(2) + " лет");
        }
        if (arrName.get(3) >= age) {
            System.out.println(returnName.arrName(new ArrayList<>()).get(3) + returnName.arrAge(new ArrayList<>()).get(3) + " лет");
        }
        if (arrName.get(4) >= age) {
            System.out.println(returnName.arrName(new ArrayList<>()).get(4) + returnName.arrAge(new ArrayList<>()).get(4) + " лет");

        }
        return arrName;
    }
}

