import java.util.Arrays;

public class E {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12}; 
        Arrays.sort(array);

        System.out.println("Two smallest numbers: " + array[0] + ", " + array[1]);
        System.out.println("Two largest numbers: " + array[array.length - 1] + ", " + array[array.length - 2]);
    }
}
