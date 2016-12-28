package ChapterFour;


public class Invoking {

    static void newline() {
        System.out.println();
    }

    //write the first line of a method name zool and call 3 parameters
    static void zool(int x, String pet, String street) {
        System.out.println(x);
        System.out.println("The name of my first pet was " + pet);
        System.out.println("I grew up on street " + street);
    }

    //write a method called printAmerican
    static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day +", "+month +" "+date +", "+year +".");
    }

    //write a method called printEuropean
    static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
