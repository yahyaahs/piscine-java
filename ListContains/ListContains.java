import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        if (list == null || value == null){
            return false;
        }
        // your code here
        return list.contains(value);
    }
}