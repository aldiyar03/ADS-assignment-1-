public class Task_10 {
    /**
     * This method calculates the greatest common divisor (GCD) of two numbers using the Euclidean algorithm.
     *
     * Time complexity: O(log n), where n is the larger of the two numbers.
     * The algorithm repeatedly reduces the problem size by dividing the numbers, resulting in logarithmic time complexity.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of the two numbers.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32, b = 48;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
