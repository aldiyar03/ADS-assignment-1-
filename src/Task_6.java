public class Task_6 {
    /**
     * This method calculates a raised to the power of n.
     *
     * Time complexity: O(n), where n is the exponent.
     * The recursive algorithm multiplies a by itself n times.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        int a = 2, n = 10;
        System.out.println(a + " raised to the power of " + n + " is: " + power(a, n));
    }
}
