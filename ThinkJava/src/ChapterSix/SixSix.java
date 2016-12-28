package ChapterSix;


    public class SixSix {

    public static int prod(double m, int n) {
        if (n == m) {
            return n;
    } else {
            int recurse = prod(m, n -1);
            int result = n * recurse;
            return result;
        }
        }



        /** rewriting prod without temporary variables like recurse and result
         *
         * public static int prod(int m, int n)
         * if (m == n) {
         *      return n;
         * } else {
         *      return prod(m, n - 1) * n;
         * }
         * */


}
