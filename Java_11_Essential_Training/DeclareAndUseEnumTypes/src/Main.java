import model.ClothingItem;
import model.ClothingSize;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L, 19.99, 3);
//        item.setType("Shirt");
//        item.setSize("M");
//        item.setPrice(19.99);
//        item.setQuantity(3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();

        var output = String.format("Your %s %s order will cost %s ",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
