package ChapterFive;

public class Zoop {

    public static void zoop(String fred, int bob) {

        System.out.println(fred);
            if (bob == 5) {
                ping("not ");
            } else {
                System.out.println("!");
            }

    }

    public static void clink(int fork) {

        System.out.println("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {

        System.out.println("any " + strangStrung + "more ");
    }
}
