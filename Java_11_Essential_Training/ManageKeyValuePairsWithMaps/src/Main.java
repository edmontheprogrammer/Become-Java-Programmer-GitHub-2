import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> items = new HashMap<>();
        items.put("perth", "WA");
        items.put("Wellington", "NZ");
        items.put("Denver", "CO");
        items.put("Dallas", "TX");
        var anItem1 = items.get("perth");
        var anItem2 = items.get("Dallas");
        System.out.println(anItem1);
        System.out.println(anItem2);
        System.out.println();
        System.out.println("--------------------------");
        var keys = items.keySet();
        for (String key :
                keys) {
            var item = items.get(key);
            System.out.println(item);
        }
    }
}
