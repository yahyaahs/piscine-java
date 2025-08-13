import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        // your code here
		Arrays.sort(args);

		String n= String.join(" ", args);
		System.out.println(n);

    }
}