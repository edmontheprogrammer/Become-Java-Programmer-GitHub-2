public class Main {

    public static void main(String[] args) {
        short sh = 100;

        int i = sh;

        long longValue = i;

       // short shortValue = longValue; error

        short shotValue = (short) longValue; // casting syntax

    }
}
