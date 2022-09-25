import java.util.Scanner;

public class Main {

    /**
     * Collect user input and get the values that are cast as primitive doubles
     * these are numbers that have fractional values. And then divide one by the other.
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter number 2: ");
        double number2 = scanner.nextDouble();

        double result = number1 / number2;
        System.out.println("Number 1 divided by number 2: " + result);


    }
}
