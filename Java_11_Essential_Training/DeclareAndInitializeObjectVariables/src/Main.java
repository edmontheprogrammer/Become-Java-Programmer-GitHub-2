import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double value = 0.012;
        double pSum = value + value + value;
        System.out.println(pSum);

        var stringValue = Double.toString(value);
        var bigValue = new BigDecimal(stringValue);
        var bigSum = bigValue.add(bigValue).add(bigValue);
        var sum = bigSum.doubleValue();
        System.out.println(sum);

    }
}
