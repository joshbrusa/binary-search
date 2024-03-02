package src;

public class Main {
    /**
     * Our binary search algo.
     */
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // check if we found the target
            if (arr[mid] == target) {
                return mid;
            }

            // if target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // if target is smaller, ignore right half
                right = mid - 1;
            }
        }

        // If target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
