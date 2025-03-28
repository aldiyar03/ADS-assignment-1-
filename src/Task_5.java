public class Task_5 {
    /**
     * This method calculates the nth Fibonacci number using recursion.
     *
     * Time complexity: O(2^n), where n is the input number.
     * The recursive algorithm calls itself twice for each n, leading to an exponential time complexity.
     * This can be optimized using dynamic programming to reduce time complexity.
     *
     * @param n The index in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
    }
}
