package scaner1;

import java.util.Scanner;

public class hexadezimalsystem {
    public static void main(String[] args) {

        System.out.println("Zahl bitte angeben" + ":");

        Scanner scaner = new Scanner(System.in);

        int number1 = scaner.nextInt();
        int number2 = scaner.nextInt();



        int result = number1 + number2;

        System.out.println(result);
    }
}
