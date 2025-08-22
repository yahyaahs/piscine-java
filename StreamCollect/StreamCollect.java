import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // your code here
        return s.collect(Collectors.groupingBy(st -> st.charAt(0)));
    }
    // public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
    //     // your code here
    // }

    // public static String orderAndConcatWithSharp(Stream<String> s) {
    //     // your code here
    // }
}