public class Main {
    public static void main(String[] args) {

        byte b = 1;
        short sh = 1;
        int i = 1;
        System.out.println("b =  " + b);
        System.out.println("sh = " + sh);
        System.out.println("i - " + i);

        var v = 1;
        var longValue = 3_000_000;
        var floatValue = 3000000000.3434f;

        System.out.println("v = " + v);
        System.out.println("longValue " + longValue);
        System.out.println("floatValue = " + floatValue);

        byte b2 = 127;
        if (b2 < Byte.MAX_VALUE) {
            b2++;
        }
    }
}
