import java.util.*;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
          if (list == null){
            return null;
        }
        List<Integer> sorted = new ArrayList<>(list);
         sorted.sort(null);
         return sorted;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        if (list == null){
            return null;
        }
        List<Integer> sorted = new ArrayList<>(list);
        sorted.sort((a,b)-> b-a);  
        return sorted;
    }
}