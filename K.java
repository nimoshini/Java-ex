import java.util.Arrays;

 class K {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 0, 1, 1}; 
        int[] result = new int[array.length];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        for (int num : array) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        System.out.println("Array with even numbers first: " + Arrays.toString(result));
    }
}
