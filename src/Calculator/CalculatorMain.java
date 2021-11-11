package Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Addition: ");
        sleep();
        System.out.println("First number to add:");
        double a = scanner.nextDouble();
        sleep();
        System.out.println("Second number to add:");
        double b = scanner.nextDouble();
        sleep();
        System.out.println("Result of addition: " + (a + b));

        sleep();

        System.out.println("Subtraction:");
        sleep();
        System.out.println("First number to subtract:");
        double c = scanner.nextDouble();
        sleep();
        System.out.println("Second number to substract:");
        double d = scanner.nextDouble();
        sleep();
        System.out.println("Result of subtraction: " + (c - d));

        sleep();

        System.out.println("Multiplication:");
        sleep();
        System.out.println("First numbet to multiply:");
        double e = scanner.nextDouble();
        sleep();
        System.out.println("Second number to multiply:");
        double f = scanner.nextDouble();
        sleep();
        System.out.println("Result of multiplication: " + (e * f));

        sleep();


        System.out.println("Divide:");
        sleep();
        System.out.println("First number to divide:");
        double g = scanner.nextDouble();
        sleep();
        System.out.println("Second number to divide:");
        double h = scanner.nextDouble();
        sleep();
        System.out.println("Result of dividing: " + (g / h));





    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
