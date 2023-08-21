/* WAP to check if a given number is sorted or not */

public class Recursion_07 {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        boolean result = isSorted(arr, 0);

        if (result) {
            System.out.println("Sorted array");
        } else {
            System.out.println("Not a sorted array");
        }
    }
}

/* Time Complexity: O(n) & Space Complexity: O(n) */