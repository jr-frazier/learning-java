package LinkedHadshMapExample;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 987888);
        phonebook.put("Brenda", 33333);
        phonebook.put("Gary", 22222);
        phonebook.put("Dave", 77777);
        System.out.println("Keving's number: " + phonebook.get("Kevin"));

        System.out.println(phonebook);
    }
}
