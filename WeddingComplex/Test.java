import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        System.out.println(WeddingComplex.createBestCouple(
                Map.of("Naruto", List.of("Sakura", "Hinata", "test1"), "Sasuke", List.of("test1", "Sakura", "Hinata")),
                Map.of("Sakura", List.of("Sasuke", "test1", "Naruto"), "Hinata", List.of("Naruto", "test1", "Sasuke"))));
    }
}