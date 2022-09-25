public class Main {

    public static void main(String[] args) {

        char c1 = '1';

        var c2 = '2';

        char c3 = '3';

        char dollar = '\u0024';

        var upper = Character.toUpperCase(c1);
        c1 = 'a';
        System.out.println(upper);

        // creating an arrray of characters
        char[]  chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars);

        // converting the character array to String data type
        String s = new String(chars);


        // converting the String object to an array of characters
        var charArray = s.toCharArray();
        System.out.println(charArray);

    }
}
