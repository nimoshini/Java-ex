public class RemoveStar {
    public static String removeStar(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '*') {
                i++; // Skip the character after '*'
            } else if (i > 0 && str.charAt(i - 1) == '*') {
                // Skip the character before '*'
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStar("ab*cd")); // Output: ad
    }
}
