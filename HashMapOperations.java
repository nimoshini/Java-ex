import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        // Creating a HashMap with String objects
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington, D.C.");
        map.put("Canada", "Ottawa");
        map.put("Mexico", "Mexico City");

        // a) Check if a particular key exists
        String keyToCheck = "Canada";
        boolean keyExists = map.containsKey(keyToCheck);
        System.out.println("Key '" + keyToCheck + "' exists: " + keyExists);

        // b) Check if a particular value exists
        String valueToCheck = "Ottawa";
        boolean valueExists = map.containsValue(valueToCheck);
        System.out.println("Value '" + valueToCheck + "' exists: " + valueExists);

        // c) Use Iterator to loop through the map
        System.out.println("Iterating through the map:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
