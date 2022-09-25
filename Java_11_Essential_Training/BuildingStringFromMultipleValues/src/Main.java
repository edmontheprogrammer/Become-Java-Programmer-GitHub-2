public class Main {

    public static void main(String[] args) {

        var sb = new StringBuilder("Welcome");
        sb.append(" to California!");

        var s = sb.toString();
        StringBuilder b = new StringBuilder();
        b.append("Shirt size: ").
                append("M").
                append(", Qty: ").
                append(4);

        System.out.println(b);

        var s2 = b.toString();
        System.out.println(s2);
    }
}
