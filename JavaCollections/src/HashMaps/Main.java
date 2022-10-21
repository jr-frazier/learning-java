package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 555555);
        phonebook.put("Jill", 12341234);
        phonebook.put("JR", 1343434);
        phonebook.put(null, 000);

        System.out.println(phonebook);

        if(phonebook.containsKey("Kevin")) {
            phonebook.remove("Kevin");
        }

        System.out.println(phonebook);
    }
}
