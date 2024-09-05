import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        // Creating a TreeSet to store String objects
        TreeSet<String> treeSet = new TreeSet<>();
        
        // Adding elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        
        // a) Reverse the elements of the Collection
        System.out.println("TreeSet in natural order: " + treeSet);
        TreeSet<String> reversedSet = (TreeSet<String>) treeSet.descendingSet();
        System.out.println("TreeSet in reverse order: " + reversedSet);

        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("Iterating through TreeSet:");
        Iterator<String> iterator = reversedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists
        String elementToCheck = "Banana";
        boolean exists = treeSet.contains(elementToCheck);
        System.out.println("Does the TreeSet contain '" + elementToCheck + "': " + exists);
    }
}
