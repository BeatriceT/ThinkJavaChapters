package ChapterSeven;


public class SevenOne {

    /**
     * 2. Output of this program is 10 5 6 3 4 2
     * 3. Loop terminates for every positive value, because when n is odd it gets incremented by 1
     * which will eventually lead to the point where n is divisible by 2
     */

    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }

}
