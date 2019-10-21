package lesson12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // creating new map
       HashMap<String, String> map = new HashMap<>();

// adding new element to the map
        map.put("key1", "value1");
        map.put("key2", "value2");

        // getting element from map
        String value = map.get("key2");
        System.out.println(value);

        // getting all the keys
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // getting all the values
        Collection<String> values = map.values();
        System.out.println(values);

// map size
        map.size();
        System.out.println(map.size());

// removing element from map
        map.remove("key2");

// iterating over map
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
