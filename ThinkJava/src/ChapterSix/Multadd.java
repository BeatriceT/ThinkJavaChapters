package ChapterSix;

/**
 * Created by Beatrice on 15.11.2016.
 */
public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;

    }

    public static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1.0 - b);
        return multadd(a, b, c);
    }

}
