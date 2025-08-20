import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        // your code her
   
        int index = list.lastIndexOf(value);
        if(index == -1){
            return null;
        }else{
            return index;
        }    
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
          if(list.isEmpty()){
            return null;
        }
        int index = list.indexOf(value);
        if(index == -1){
            return null;
        }else{
            return index;
        }
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        // your code here
          if(list.isEmpty()){
            return list;
        }
        List<Integer> matchingIndices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                matchingIndices.add(i);
            }
        }
        return matchingIndices;
    }
}