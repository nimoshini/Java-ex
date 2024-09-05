import java.util.HashSet;
import java.util.Iterator;

public class EmployeeManager {
    public static void main(String[] args) {
        // Creating a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Adding employee names
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");

        // Retrieving elements using Iterator
        Iterator<String> iterator = employeeNames.iterator();
        System.out.println("Employee Names:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

