import java.util.Scanner;

public class RepeatLastNChars {
    public static String repeatLastNChars(String str, int n) {
      
        String lastNChars = str.substring(str.length() - n);

       
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        String result = repeatLastNChars(inputString, n);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
