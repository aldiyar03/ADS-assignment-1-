public class Task_8 {
    /**
     * This method checks if the given string consists only of digits.
     *
     * Time complexity: O(n), where n is the length of the string.
     * The algorithm checks each character of the string to ensure it is a digit.
     *
     * @param s The string to check.
     * @return True if the string consists only of digits, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        String s = "123456";
        System.out.println(s + " consists of digits: " + isAllDigits(s));

        s = "123a12";
        System.out.println(s + " consists of digits: " + isAllDigits(s));
    }
}
