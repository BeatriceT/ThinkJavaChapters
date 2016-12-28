package ChapterSix;

public class SixSeven {

    /** Make a method oddSum that computes the sum of odd numbers from 1 to n */

    public static int oddSum(int n) {
        if (n % 2 == 0) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            int sum = n + oddSum(n - 2);
            return sum;
        }


    }
}