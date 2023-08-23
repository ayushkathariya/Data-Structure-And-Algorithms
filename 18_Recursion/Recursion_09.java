/* WAP to find last occurence of an elemnet in an array */

public class Recursion_09 {
    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 5 };

        System.out.println(lastOccurance(arr, 3, 0));
    }
}

/* Time Complexity: O(n) & Space Complexity: O(n) */