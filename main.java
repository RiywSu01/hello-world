public class ArraySorter {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        sortAscending(numbers);

        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void sortAscending(int[] array) {
        int n = array.length;
        boolean swapped;

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
