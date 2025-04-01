package Arrays;

public class BitonicSearch {

    // Find peak (max) element in a bitonic array using binary search
    static int findPeak(int[] arr, int n) {
        int s = 0, e = n - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                e = mid; // Peak is on the left side
            } else {
                s = mid + 1; // Peak is on the right side
            }
        }
        return s; // Index of peak element
    }

    // Standard binary search in ascending order
    static int binarySearchAsc(int[] arr, int s, int e, int key) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    // Standard binary search in descending order
    static int binarySearchDesc(int[] arr, int s, int e, int key) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    // Bitonic Search
    static int bitonicSearch(int[] arr, int key) {
        int n = arr.length;
        int peak = findPeak(arr, n); // Step 1: Find peak element index

        // Step 2: Search in left (ascending) part
        int leftSearch = binarySearchAsc(arr, 0, peak, key);
        if (leftSearch != -1) return leftSearch;

        // Step 3: Search in right (descending) part
        return binarySearchDesc(arr, peak + 1, n - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 15, 10, 5, 2}; // Bitonic array
        int key = 8;

        int index = bitonicSearch(arr, key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }
}
