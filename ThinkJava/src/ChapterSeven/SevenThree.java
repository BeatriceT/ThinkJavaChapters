package ChapterSeven;

public class SevenThree {

    public static double power(double x, int n){

        if (n == 0) {       // anything raised to the power of 0 is 1
            return 1;
        }
        double result = 1;
        for (int i = 1; i<=n; i++) {    // loop repeats until i<=n, each time i get incremented by 1
            result = result * x;        // each time the new value is stored in result and it gets multiplied by x
            /**
             * The way loop works with values power(2, 5) :
             * SF1 1 * 2 = 2
             * SF2 2 * 2 = 4
             * SF3 4 * 2 = 8
             * SF4 8 * 2 = 16
             * SF5 16 * 2 = 32
             */
        }
        return result;
}
}