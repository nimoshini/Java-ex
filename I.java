
public class I {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java AgeValidator <name> <age>");
            return;
        }

        String name = args[0];
        try {
            int age = Integer.parseInt(args[1]);
            validateAge(age);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Age should be a valid integer.");
        } catch (I e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) throws I {
        if (age < 18 || age >= 60) {
            throw new I("Age must be between 18 and 59.");
        }
    }
}

public class I extends Exception {
    public I(String message) {
        super(message);
    }
}
