package ChapterSix;

public class Main {

    public static void newline() {
        System.out.println();
    }

    public static void main(String[] args) {

        /** Ex. 6.1 */
        SixOne.isDoubleDigit(5);
        newline();

        /** Ex. 6.2 */

        boolean isItDivisible = SixTwo.isDivisible(6, 3);

        if (isItDivisible) {
            System.out.println("n is divisible with m");
        } else {
            System.out.println("n is not divisible with m");
        }
        newline();

        /** Ex 6.3 */
        boolean isItTriangle = SixThree.isTriangle(4, 5, 3);

        if (isItTriangle) {
            System.out.println("We are dealing with a triangle here.");
        } else {
            System.out.println("That is not a triangle!");
        }
        newline();

        /** Ex 6.4 */
        System.out.println(Multadd.multadd(1.0, 2.0, 3.0));

        double a1 = Math.cos(Math.PI/4.0);
        double b1 = 1.0 / 2.0;
        double c1 = Math.cos(Math.PI/4.0);

        double firstvalue = Multadd.multadd(a1, b1, c1);
        System.out.println("sin(Pi/4) + cos(Pi/4)/2 = " + firstvalue);


        double a2 = 1.0;
        double b2 = Math.log(10);
        double c2 = Math.log(20);

        double secondvalue = Multadd.multadd(a2, b2, c2);
        System.out.println("log(20) + log(20) = " + secondvalue);

        newline();

        /** Ex. 6.6 */

        System.out.println("Exercise Six.Six: " + SixSix.prod(1, 4));

        newline();

        /** Ex. 6.7 */

        System.out.println(SixSeven.oddSum(13));

        newline();

        /** Ex. 6.8 */

        System.out.println(SixEight.ack(3, 3));

        newline();

        /** Ex. 6.9 */

        System.out.println("Exercise Six.Nine: " + SixNine.power(1, 4));

    }
}
