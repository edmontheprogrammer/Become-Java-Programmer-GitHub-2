import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var i1 = getInput(sc, "Enter value 1: ");
        var i2 = getInput(sc, "Enter value 2: ");

        double result = addValues(i1, i2);
        System.out.println("The sum is " + result);

        double resultofFour = addValues(i1, i2, i1, i2);
        System.out.println("The sum is " + resultofFour);

        double resultofMultiple = addValues(i1, i2, i1, i2, i1, i2);
        System.out.println("The sum of multiple is " + resultofFour);
    }

    private static int getInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    private static double addValues( int i1, int i2) {
        return i1 + i2;
    }

    private static double addValues( int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }

    // note 1; the '...' means this method can get any number of values from the parameter
    private static double addValues( int... values) {
        int result = 0;
        for (var value: values) {
            result += value;
        }

        return result;
    }

}
