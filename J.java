import java.util.Arrays;

public class J {
    public static void main(String[] args) {
        int[] array = {1, 10, 10, 2}; 
        int[] result = new int[array.length];
        int index = 0;

        for (int num : array) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        System.out.println("Array after removing 10's: " + Arrays.toString(result));
    }
}
