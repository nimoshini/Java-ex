public class ShortLongShort {
    public static String shortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(shortLongShort("hi", "hello")); // Output: hihellohi
    }
}
