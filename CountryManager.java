import java.util.HashSet;

public class CountryManager {
    private HashSet<String> H1 = new HashSet<>();

    // Method to add a country to the HashSet and return the updated HashSet
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to get a country from the HashSet
    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountryManager manager = new CountryManager();

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
