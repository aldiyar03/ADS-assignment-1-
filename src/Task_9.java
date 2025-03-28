public class Task_9 {
    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     *
     * Time complexity: O(2^n), where n is the input number.
     * The recursive algorithm calls itself multiple times for each n and k, leading to exponential time complexity.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        int n = 7, k = 3;
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
    }
}
