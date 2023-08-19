/* WAP to print factorial of a number */

public class Recursion_04 {
    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * findFactorial(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = findFactorial(n);
        System.out.println(result);
    }
}

/* Time Complexity: O(n) & Space Complexity: O(n) */