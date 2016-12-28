package ChapterFive;

/**
 * Created by Beatrice on 18.11.2016.
 */
public class FiveTwo {

    public static void checkFermat(int a, int b, int c, int n) {

        //Checking whether Fermat's Theorem holds
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

}
