import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
 class K {
    public static void main(String[] args) {
        Integer[] array = {12, 34, 12, 45, 67, 89};

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
        Integer[] uniqueArray = set.toArray(new Integer[0]);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
