import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        // your code here
        int i = 0;
        return s.mapToInt(String::length).sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        // your code here
        return s.map(str -> str.toUpperCase()).collect(Collectors.toList());
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        // your code here
        return s.filter(i -> i > 42 ).map(Double::intValue).collect(Collectors.toSet());
    }
}