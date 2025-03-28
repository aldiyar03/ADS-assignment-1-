public class Task_7 {
    /**
     * This method reverses the given array without using an array data structure.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm recursively traverses the array and prints the elements in reverse order.
     *
     * @param arr The array to reverse.
     * @param index The current index of the element to print.
     */
    public static void reverseArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        reverseArray(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 4, 6, 2};
        System.out.print("Reversed array: ");
        reverseArray(numbers, 0);
    }
}
