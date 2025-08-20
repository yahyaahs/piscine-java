import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        // your code her
        return list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
        return list.indexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        // your code here
        List<Integer> matchingIndices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                matchingIndices.add(i);
            }
        }
        return matchingIndices;
    }
}