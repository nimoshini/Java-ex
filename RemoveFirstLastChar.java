import java.util.Scanner;

public class RemoveFirstLastChar {
    public static String removeFirstLastChar(String str) {

        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
       
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeFirstLastChar(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
