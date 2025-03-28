public class Task_1 {
    /**
     * This method finds the minimum number in the given array.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm iterates through the array once, comparing each element to find the minimum.
     *
     * @param arr The array of numbers.
     * @return The minimum value in the array.
     */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 1, 32, 3, 45};
        System.out.println("Minimum value: " + findMin(numbers));
    }
}
