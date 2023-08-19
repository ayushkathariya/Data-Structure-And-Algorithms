/* WAP to print sum of first n natural numbers */

public class Recursion_05 {
    public static int printNatural(int n) {
        if (n == 1) {
            return n;
        }
        int sum = n + printNatural(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 100;
        int result = printNatural(n);
        System.out.println(result);
    }
}

/* Time Complexity: O(n) & Space Complexity: O(n) */