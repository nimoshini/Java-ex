import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer between 1 and 255:");
        int number = scanner.nextInt();
        
        if (number < 1 || number > 255) {
            System.out.println("Number out of range. Please enter a number between 1 and 255.");
        } else {
            String binaryString = Integer.toBinaryString(number);
            String paddedBinaryString = String.format("%8s", binaryString).replace(' ', '0');
            System.out.println(paddedBinaryString);
        }
        
        scanner.close();
    }
}
