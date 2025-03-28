public class Task_2 {
    /**
     * This method calculates the average of the given array of numbers.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm sums all elements in the array, then divides the sum by the array length.
     *
     * @param arr The array of numbers.
     * @return The average of the elements in the array.
     */
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        // Example usage of the findAverage method
        int[] numbers = {4, 5, 6, 7};
        double average = findAverage(numbers);
        System.out.println("The average is: " + average);
    }
}
