package ChapterSeven;


public class SevenFive {

    public static double myexp(double x, int n){

    double result = 0;
    int i = 2;
    while (i <= n) {
        result = result + SevenThree.power(x, i)/SevenFour.factorial(i);
        i = i + 1;
    }
        return (1 + x + result);




}




}
