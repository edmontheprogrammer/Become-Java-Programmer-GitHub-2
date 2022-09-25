public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        // creating a string variable that allows you to insert string variables into the "template"
        // variable
        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        // itemString is a variable that takes the template and list of string variables we
        // want to format. Just make sure the string type can work with the given format
        var itemString = String.format(template,
                item, size, color, price);

        System.out.println(itemString);
    }
}
