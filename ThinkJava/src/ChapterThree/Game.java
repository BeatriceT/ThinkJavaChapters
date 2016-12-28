package ChapterThree;

import java.util.Random;
import java.util.Scanner;
public class Game {

    public static void myNumber() {

        Scanner in = new Scanner(System.in);

        System.out.println("I am thinking of a number between 1 and 100. Can you guess what it is? ");
        System.out.print("Type the number: ");
        int yourGuess = in.nextInt();

        System.out.printf("Your guess is: %d\n", yourGuess);

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("The number I was thinking of is: " + number);

        int difference = Math.abs(number - yourGuess);

        System.out.println("You were off by: " + difference);




    }
}
