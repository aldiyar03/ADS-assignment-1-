public class Task_4 {
    /**
     * This method calculates the factorial of a given number using recursion.
     *
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to 1, resulting in linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + "! = " + factorial(number));
    }
}
