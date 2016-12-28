package ChapterFive;

import java.util.Scanner;
import java.util.Random;

public class FiveSeven {

    public static void game() {

        System.out.println("I am thinking of a number between 1 and 100. Can you guess what it is? ");
        System.out.print("Type the number: ");

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();

        System.out.println("The number you guessed was: " + guess);

        if (guess > number){
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }

        hint(number);

    }

    public static void hint(int number) {

        System.out.print("Guess again: ");
        Scanner in = new Scanner(System.in);
        int newguess = in.nextInt();

        if (newguess == number) {
            System.out.println("Your guess was correct");
        } else if (newguess > number) {
            System.out.println("Your guess was too high.");
            hint(number);
        } else {
            System.out.println("Your guess was too low.");
            hint(number);
        }

    }

}
