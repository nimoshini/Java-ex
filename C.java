public class C{
    public static void main(String[] args) {
        int[] array = {1, 4, 34, 56, 7}; 
        int searchElement = 56; 
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
