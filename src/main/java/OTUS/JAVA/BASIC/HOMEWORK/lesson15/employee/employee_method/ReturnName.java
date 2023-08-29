package otus.java.basic.homework.lesson15.employee.employee_method;

import otus.java.basic.homework.lesson15.employee.Employee;

import java.util.ArrayList;

public class ReturnName {

    public ArrayList<String> arrName(ArrayList<String> listEmployee) {
        Employee employee1 = new Employee("Андрей: ");
        listEmployee.add(employee1.getName());

        Employee employee2 = new Employee("Юра: ");
        listEmployee.add(employee2.getName());

        Employee employee3 = new Employee("Влад: ");
        listEmployee.add(employee3.getName());

        Employee employee4 = new Employee("Антон: ");
        listEmployee.add(employee4.getName());

        Employee employee5 = new Employee("Миша: ");
        listEmployee.add(employee5.getName());


        return listEmployee;
    }

    public ArrayList<Integer> arrAge(ArrayList<Integer> listEmployee) {


        Employee employee1 = new Employee(18);
        listEmployee.add(employee1.getAge());

        Employee employee2 = new Employee(20);
        listEmployee.add(employee2.getAge());

        Employee employee3 = new Employee(25);
        listEmployee.add(employee3.getAge());

        Employee employee4 = new Employee(30);
        listEmployee.add(employee4.getAge());

        Employee employee5 = new Employee(19);
        listEmployee.add(employee5.getAge());


        return listEmployee;
    }

    public static void print() {
        ReturnName returnName = new ReturnName();
        returnName.arrName(new ArrayList<>());
        returnName.arrAge(new ArrayList<>());

        System.out.println(
                returnName.arrName(new ArrayList<>()).get(0) + returnName.arrAge(new ArrayList<>()).get(0) + " лет" + "\n" +
                        returnName.arrName(new ArrayList<>()).get(1) + returnName.arrAge(new ArrayList<>()).get(1) + " лет" + "\n" +
                        returnName.arrName(new ArrayList<>()).get(2) + returnName.arrAge(new ArrayList<>()).get(2) + " лет" + "\n" +
                        returnName.arrName(new ArrayList<>()).get(3) + returnName.arrAge(new ArrayList<>()).get(3) + " лет" + "\n" +
                        returnName.arrName(new ArrayList<>()).get(4) + returnName.arrAge(new ArrayList<>()).get(4) + " лет" + "\n");
    }

}
