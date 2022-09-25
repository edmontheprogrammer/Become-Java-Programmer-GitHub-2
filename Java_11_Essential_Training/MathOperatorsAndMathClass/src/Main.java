public class Main {

    public static void main(String[] args) {
         var intValue1 = 56;
         var intValue2 = 42;
         var result1 = intValue1 + intValue2;
        var result2 = intValue1 - intValue2;
        var result3 = intValue1 * intValue2;
        var result4 = intValue1 / intValue2;

        double doubleValue = -3.99999;

        long rounded = Math.round(doubleValue);
        System.out.println("rounded = " + rounded);

        double absValue = Math.abs(doubleValue);
    }
}
