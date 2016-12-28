package ChapterFive;


public class FiveFive {

    public static void theBeerSong(int n) {

        if (n == 0) {
            lastVerse();
        } else {
            System.out.println(n + " bottles of beer on the wall");
            System.out.println(n + " bottles of beer");
            System.out.println("ya' take one down, ya' pass it around");
            System.out.println(n - 1 + " bottles of beer on the wall");
            System.out.println();
            theBeerSong(n - 1);
        }
    }
    public static void lastVerse() {

        System.out.println("No bottles of beer on the wall");
        System.out.println("no bottles of beer");
        System.out.println("ya' don't take one down, ya' don't pass it around");
        System.out.println("'cause there are no more bottles of beer on the wall");

    }

    }


