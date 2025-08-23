import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // your code here
        Map<String, String> m = new HashMap<>();
        List<String> key = new ArrayList<>(first);
        List<String> val = new ArrayList<>(second);

        for(int i = 0; i<Math.min(key.size(), val.size()); i++){
            m.put(key.get(i), val.get(i));
        }
        return m;
    }
}