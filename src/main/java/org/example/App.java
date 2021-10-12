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
                    calculator();
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
    public static void calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Choose an operator: +, -, * or /");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Enter the numbers you want to add together. If you enter 0 the addition ends.");
                Scanner input1 = new Scanner(System.in);
                int number;
                int result = 0;
                do {
                    number = input1.nextInt(); //This creates a variable called number that stores the user input.

                    result+= number; //This uses the variable result and adds it to the variable number.

                } while(number != 0); //As long as the number inserted by the user isn't zero(0) the loop continues.

                System.out.println("Sum is : " + result);
                break;

            case '-':
                System.out.println("Enter the numbers you want to subtract from each other. If you enter 0 the addition ends.");
                Scanner input2 = new Scanner(System.in);
                int number1;
                int result1 = 0;
                do {
                    number1 = input2.nextInt(); //This creates a variable called number that stores the user input.

                    result1-= number1; //This uses the variable result and subtracts it from the variable number.

                } while(number1 != 0); //As long as the number inserted by the user isn't zero(0) the loop continues.

                System.out.println("The difference is : " + result1);
                break;

            case '*':
                System.out.println("Enter the first number you want to multiply");
                int number2 = input.nextInt();

                System.out.println("Enter the second number you want to multiply");
                int number3 = input.nextInt();

                int result2 = number2 * number3;
                System.out.println("The product is : " + result2);
                break;

            case '/':
                System.out.println("Enter the first number you want to divide");
                int number4 = input.nextInt();

                System.out.println("Enter the second number you want to divide");
                int number5 = input.nextInt();
                try {
                    int result3 = number4 / number5;
                    System.out.println("The quotient is : " + result3);
                }
                catch (Exception e){
                    System.out.println("You can't divide by zero (0)");
                }
                break;

            default:
                System.out.println("You entered an invalid operator!");
                break;


        }
    }
}
