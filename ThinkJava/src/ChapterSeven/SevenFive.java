package ChapterSeven;


public class SevenFive {


    public static double myexp(double x, int n){

    //declarations for loop
        double pow = x;
        double result = 0;
    int i = 2;
    while (i <= n) {
        pow = pow * x;
        result = result + pow/SevenFour.factorial(i);
        i = i + 1;
    }
        return (1 + x + result);




}




}
