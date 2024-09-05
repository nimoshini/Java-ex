import java.util.Scanner;

public class H{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        
            System.out.println("Enter name of the first student:");
            String student1 = scanner.nextLine();
            System.out.println("Enter marks in 3 subjects for " + student1 + ":");
            int marks1 = getMarks(scanner);
            int marks2 = getMarks(scanner);
            int marks3 = getMarks(scanner);

            System.out.println("Enter name of the second student:");
            String student2 = scanner.nextLine();
            System.out.println("Enter marks in 3 subjects for " + student2 + ":");
            int marks4 = getMarks(scanner);
            int marks5 = getMarks(scanner);
            int marks6 = getMarks(scanner);


            double average1 = (marks1 + marks2 + marks3) / 3.0;
            double average2 = (marks4 + marks5 + marks6) / 3.0;

            System.out.println(student1 + " average marks: " + average1);
            System.out.println(student2 + " average marks: " + average2);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please enter valid integers.");
        } catch (NegativeMarksException | MarksOutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int getMarks(Scanner scanner) throws NumberFormatException, NegativeMarksException, MarksOutOfRangeException {
        int marks = Integer.parseInt(scanner.nextLine());
        if (marks < 0) {
            throw new NegativeMarksException("Marks cannot be negative.");
        }
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfRangeException("Marks should be in the range 0-100.");
        }
        return marks;
    }
}
class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}
