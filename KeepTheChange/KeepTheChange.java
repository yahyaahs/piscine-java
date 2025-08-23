import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        // your code here
        List<Integer> res = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>(coins);
        sorted.sort(Comparator.reverseOrder());

        for(int coin: sorted){
            while (amount >= coin) {
                amount-= coin;
                res.add(coin);
                
            }
        }
        return res;
    }
}