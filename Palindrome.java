public class Palindrome {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }
        
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
        
        try {
            int number = Integer.parseInt(args[0]);
            
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}
