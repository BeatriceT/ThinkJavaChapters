package ChapterFour;


public class Main {


    public static void main(String[] args) {


        //calling the method zool
        int x = 11;
        Invoking.zool(x, "Sofia", "Kuuse");

        Invoking.newline();

        //calling the method printAmerican
        int date = 8;
        int year = 2016;
        String day = "Tuesday";
        String month = "November";
        Invoking.printAmerican(day, month, date, year);

        Invoking.newline();

        //calling the method printEuropean
        Invoking.printEuropean(day, date, month, year);

    }

}
