import java.util.TreeSet;

public class TreeSetCountryManager {
    private TreeSet<String> H1 = new TreeSet<>();

    // Method to add a country to the TreeSet and return the updated TreeSet
    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to get a country from the TreeSet
    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeSetCountryManager manager = new TreeSetCountryManager();

        // Adding countries
        manager.saveCountryNames("USA");
        manager.saveCountryNames("Canada");
        manager.saveCountryNames("Mexico");

        // Getting countries
        System.out.println("Country USA exists: " + manager.getCountry("USA"));    // Should print "USA"
        System.out.println("Country Canada exists: " + manager.getCountry("Canada")); // Should print "Canada"
        System.out.println("Country Brazil exists: " + manager.getCountry("Brazil"));  // Should print "null"
    }
}
