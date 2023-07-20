package lesson5_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Map <String, String> rawPhonebook = new HashMap<>();
        rawPhonebook.put("3", "Иван");
        rawPhonebook.put("4", "Петр");
        rawPhonebook.put("1", "Алексей");
        rawPhonebook.put("2", "Василий");
        rawPhonebook.put("8", "Василий");
        System.out.println(reversePhoneBook(rawPhonebook));
    }

    public static Map <String, ArrayList<String>> reversePhoneBook(Map <String, String> rawPhoneBook) {
        TreeMap<String, String> treeMapPhoneBook = new TreeMap<>(Collections.reverseOrder());
        treeMapPhoneBook.putAll(rawPhoneBook);
        Map <String, ArrayList<String>> phoneBook = new LinkedHashMap<String, ArrayList<String>>();
        for (Map.Entry<String, String> el : treeMapPhoneBook.entrySet()) {
            if(phoneBook.containsKey(el.getValue())) {
                phoneBook.get(el.getValue()).add(el.getKey());
            }
            else {
                ArrayList <String> list= new ArrayList<String>();
                list.add(el.getKey());
                phoneBook.put(el.getValue(), list);
            }
        }
        return phoneBook;
    }
}
