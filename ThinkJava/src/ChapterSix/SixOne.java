package ChapterSix;

public class SixOne {

    /**
     * Exercise 6.1
     * 1.What happens if you invoke a value method but do nothing with the result?
     * Compiler runs the code but doesn't display any results
     * 2. What happens if you use void method as part of an expression like: System.out.println("boo!") + 7;
     * An error occures and the code does't run
     */
    public static boolean isDoubleDigit(int x) {
        //System.out.println("boo!") + 7;
        return (x >= 10 && x < 100);
    }

}
