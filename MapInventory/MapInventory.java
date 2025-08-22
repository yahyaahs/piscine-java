import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // your code here
        try{
            return inventory.get(productId);
        }catch(NullPointerException e){
            return -1;
        }
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // your code here
        List<String> match = new ArrayList<>();
        for(String id : inventory.keySet()){
            if(inventory.get(id) == price){
                match.add(id);
            }
        }
        return match;
    }
}