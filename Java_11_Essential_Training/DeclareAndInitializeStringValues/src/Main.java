public class Main {

    public static void main(String[] args) {

        String s1 = "This is a String ";

        var s2 = "This is another String!";

        var s3 = new String("This is also a String!");

        var chars = s1.toCharArray();
        System.out.println(chars);

        String s4 = "Shirt size: ";
        String s5 = "M";
        String s6 = s4 + s5 + ", Qty: " + 4;

        s6 += ", very elegant";

        var upper = s6.toUpperCase();
        System.out.println(upper);

        var charAt = s6.charAt(4);
        System.out.println(charAt);


    }
}
