import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCountryCapitalManager {
    private TreeMap<String, String> M1 = new TreeMap<>();

    // Method to add country and capital to the TreeMap and return the updated TreeMap
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Method to get the capital of a country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Method to get the country for a given capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Method to create a new map with capital as key and country as value
    public TreeMap<String, String> createCapitalCountryMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // Method to create an ArrayList with all country names
    public ArrayList<String> getCountryNames() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        TreeMapCountryCapitalManager manager = new TreeMapCountryCapitalManager();
        
        // Adding countries and capitals
        manager.saveCountryCapital("India", "Delhi");
        manager.saveCountryCapital("Japan", "Tokyo");

        // Testing methods
        System.out.println("Capital of India: " + manager.getCapital("India"));       // Delhi
        System.out.println("Country with capital Tokyo: " + manager.getCountry("Tokyo")); // Japan

        TreeMap<String, String> M2 = manager.createCapitalCountryMap();
        System.out.println("M2 Map: " + M2);

        ArrayList<String> countryNames = manager.getCountryNames();
        System.out.println("Country Names: " + countryNames);
    }
}

