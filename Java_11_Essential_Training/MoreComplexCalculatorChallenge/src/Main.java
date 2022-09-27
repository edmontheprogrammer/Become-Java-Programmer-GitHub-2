import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            * Create a calculator that can handle multiple operations
            * and handles exceptions if the user does not enter a correct value and
            * can execute multiple operations.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int first_number = 0;
        try {
            first_number = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter a second number: ");
        int second_number = 0;
        try {
            second_number = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Select an operation... (1: Addition), (2: Subtraction), " +
                "(3: Multiplication), (4: Division)");
        int operator = 0;
        try {
            operator = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int result = 0;

        if (operator == 1) {
            try {
                result = first_number + second_number;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (operator == 2) {
            try {
                result = first_number - second_number;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (operator == 3) {
            try {
                result = first_number * second_number;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (operator == 4) {
            try {
                result = first_number / second_number;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("result: " + result);

    }
}
