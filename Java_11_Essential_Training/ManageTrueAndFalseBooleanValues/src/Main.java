public class Main {

    public static void main(String[] args) {

        boolean aValue = true;

        var b1 = true;
        var b2 = false;
        var b4 = !b1;

        var i = 0;
        var b5 = (i != 0);
        System.out.println(b5);

        var s = "true";
        var b6 = Boolean.parseBoolean(s);
        System.out.println(b6);
    }
}
