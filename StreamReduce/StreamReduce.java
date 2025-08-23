import java.util.stream.Stream;

public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        // your code here
        return s.reduce(0, (i, e)-> i+e);
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        // your code here
        return s.reduce(0, (i, e) -> (e /divider)+i);
    }
}