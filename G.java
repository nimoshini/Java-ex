public class G {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integer arguments.");
            return;
        }

        int[] numbers = new int[5];
        try {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}
