public class Task_3 {
    /**
     * This method checks whether a given number is prime.
     *
     * Time complexity: O(√n), where n is the input number.
     * The algorithm checks divisibility from 2 to the square root of n, making it efficient for large numbers.
     *
     * @param n The number to check.
     * @return True if the number is prime, false if it is composite.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println(number + " is " + (isPrime(number) ? "Prime" : "Composite"));
    }
}
