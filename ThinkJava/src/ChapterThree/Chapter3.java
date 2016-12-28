package ChapterThree;

import java.util.Scanner;

public class Chapter3 {

    public static void threeOne() {

        int firstnr = 20;
        double secondnr = 12.75;

        //using %f to display the value of type int --> output is Error
        System.out.printf("%f", firstnr);

        //using %d to display the value of type double --> output is Error
        System.out.printf("%d", secondnr);

        //using both %f and %d to display type int value --> output is Error ( f != Integer)
        System.out.printf("%d %f", firstnr);
    }

    public static void threeTwo() {

        //converting temperature from Celsius to Fahrenheit, using user input

        double Celsius;
        double Fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.print("Insert the degrees in Celsius you want to convert: ");
        Celsius = in.nextDouble();

        Fahrenheit = Celsius * 9/5 + 32;

        System.out.printf("%.1f  C = %.1f  F", Celsius, Fahrenheit);
    }

    public static void threeThree() {

        //write a program that converts total nrs of seconds to hours minutes and seconds with user input

        int seconds, hour, minute, second;

        Scanner in = new Scanner(System.in);

        System.out.print("The seconds you want to convert: ");
        seconds = in.nextInt();

        hour = seconds / (60*60);
        minute = seconds / 60 % 60;
        second = seconds % 60;

        System.out.printf("%d seconds is %d hours %d minutes %d seconds", seconds, hour, minute, second);
    }




}
