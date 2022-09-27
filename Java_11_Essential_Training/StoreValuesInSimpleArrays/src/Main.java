import model.ClothingItem;
import model.ClothingSize;
import model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        // creating an array in Java
        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        ClothingItem[] items = {new Shirt( ClothingSize.L, 19.99, 3)};
        
    }

    private static void displayItemDetails(Shirt item, double totalPrice, NumberFormat formatter) {
        var output = String.format("Your %s %s order will cost %s ",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
