package otus.java.basic.homework.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBookMap = new HashMap<>();

    public void add(String name, String phone) {
        ArrayList<String> phoneNumbers = phoneBookMap.get(name);
        if (phoneNumbers == null) {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phone);
            phoneBookMap.put(name, numbers);
        } else {
            if (!phoneNumbers.contains(phone)) {
                phoneNumbers.add(phone);
                phoneBookMap.put(name, phoneNumbers);
            }
        }
    }

    public ArrayList<String> find(String name) {
        return phoneBookMap.get(name);
    }

    public String containsPhoneNumber(String phone) {
        for (Map.Entry<String, ArrayList<String>> entry : phoneBookMap.entrySet()) {
            for (String n : entry.getValue()) {
                if (n.equals(phone)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }
}
