class Prime  {
    
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
