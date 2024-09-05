import java.util.Iterator;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties statesCapitals = new Properties();
        statesCapitals.setProperty("Maharashtra", "Mumbai");
        statesCapitals.setProperty("Karnataka", "Bengaluru");
        statesCapitals.setProperty("Tamil Nadu", "Chennai");

        // Using Iterator to list all elements
        Iterator<String> iterator = (Iterator<String>) statesCapitals.propertyNames();
        while (iterator.hasNext()) {
            String state = iterator.next();
            String capital = statesCapitals.getProperty(state);
            System.out.println(state + " -> " + capital);
        }
    }
}


