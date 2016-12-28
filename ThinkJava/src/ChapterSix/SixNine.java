package ChapterSix;

public class SixNine {

    public static double power(double x, int n) {
        if (n == 0) {                       // the base case - ends the recursion
            return 1;
        } else {
            return x * power(x, n - 1);     // method invokes itself until it gets to the base case
            /**
             * How recursion works here with values power(3,4)
             * SF1 3 * power(3, 3)
             * SF2 3 * 3 * power(3, 2)
             * SF3 3 * 3 * 3 * power(3, 1)
             * SF4 3 * 3 * 3 * 3 * power(3, 0) - because n = 0 it returns 1
             * SF  3 * 3 * 3 * 3 * 1 = 81
             */

        }

    }

}