public class Reverse {
    
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit; 
            number /= 10; 
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 1234; 
        int reversedNumber = reverseNumber(number);
        System.out.println("The reverse of " + number + " is: " + reversedNumber);
    }
}
