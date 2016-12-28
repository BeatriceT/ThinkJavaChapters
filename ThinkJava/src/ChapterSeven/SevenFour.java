package ChapterSeven;

public class SevenFour {


    /** Factorial with recursion
        public static int fact(int n) {

        if (n == 0) {
            return n;
        } else {
            return n * fact(n -1);
        }
    }
     */

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        int result = n;
        int i = n - 1;
        while (i > 0) {
        result = result * i;
        i = i - 1;
        }
        return result;

        /**
         * The way loop works with value 4
         * SF1 i = 4 - 1 = 3; 3 > 0;     result = n = 4 --> 4 * 3;      i = 3 - 1 = 2;
         * SF2 4 * 3 * 2
         * SF3 4 * 3 * 2 * 1 = 24
         */
    }

}
