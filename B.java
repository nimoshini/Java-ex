public class B {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
