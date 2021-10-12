package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        boolean isRunning = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Welcome co the calculator! \n \n 1. Start the calculations \n \n 2. Quit the program \n \n");
            System.out.print("To continue enter a number from the index:");
            int index = input.nextInt();
            switch (index) {
                case 1:

                    break;

                case 2:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;

            }
        }while(isRunning);
        System.out.print("You have closed the calculator. \nGood bye!");

    }
}
