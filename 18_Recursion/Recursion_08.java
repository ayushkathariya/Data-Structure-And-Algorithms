/* WAP to find first occurence of an elemnet in an array */

public class Recursion_08 {
    public static int findIndex(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findIndex(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int i = 0, key = 2;

        int result = findIndex(arr, i, key);

        if (result != -1) {
            System.out.println("Index is " + result);
        } else {
            System.out.println("Key is not present");
        }

    }
}
