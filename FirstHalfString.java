package string;

import java.util.Scanner;

public class FirstHalfString {
    public static String getFirstHalf(String str) {
        int length = str.length();
      
        if (length % 2 == 0) {
   
            return str.substring(0, length / 2);
        } else {
         
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = getFirstHalf(input);
        
        if (result != null) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Result: null");
        }

        scanner.close();
    }
}
