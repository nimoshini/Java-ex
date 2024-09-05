import java.util.Scanner;

public class StringRepeater {
    public static String repeatFirstTwoChars(String str) {
       
        int n = str.length();

        
        String firstTwoChars;
        if (n >= 2) {
            firstTwoChars = str.substring(0, 2);
        } else {
            firstTwoChars = str;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwoChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = repeatFirstTwoChars(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
