package ChapterSeven;


public class SevenTwo {

    public static void squareRoot(double a) {
        double n = a/2;
        double x1 = (n + a/n)/2;
        double x2 = (x1 + a/x1)/2;
        while (Math.abs(x1 - x2) >= 0.0001) {
            x1 = (x2 + a/x2)/2;
            x2 = (x1 + a/x1)/2;
        }
        System.out.println(x2);
    }
}