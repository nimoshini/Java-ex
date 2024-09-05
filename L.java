public class Only14 {
    public static void main(String[] args) {
        int[] array = {1, 4, 1, 4}; 
        boolean isOnly14 = true;

        for (int num : array) {
            if (num != 1 && num != 4) {
                isOnly14 = false;
                break;
            }
        }

        System.out.println(isOnly14);
    }
}
