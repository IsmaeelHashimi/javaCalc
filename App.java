import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        int caseNum;
        
        System.out.println("Welcome to my simple calculator!");
        System.out.println("------------------------------------");
        System.out.print("Enter 2 numbers: ");
        

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();

        System.out.println("Enter the number that matches the operation you want to do");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] num1^num2");
        caseNum = scnr.nextInt();
        
        switch (caseNum){
            case 1:
            num3 = num1 + num2;
            System.out.println("The sum of your first and second number is " + num3);
            break;

            case 2:
            num3 = num1 - num2;
            System.out.println("Your first number subtracted by your second number is " + num3);
            break;

            case 3:
            num3 = num1 * num2;
            System.out.println("The product of your first and second number is " + num3);
            break;

            case 4:
            num3 = num1 / num2;
            System.out.printf("The result of the division is %.2f", num3);
            break;

            case 5:
            num3 = Math.pow(num1, num2);
            System.out.println("Your first number to the exponent of the second is " + num3);
            break;

            default:
            System.out.println("Invalid input, try again.");
            break;
            


        }

        }





    }

