import java.io.IOException;
import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        // your code here
        Pattern p = Pattern.compile("[a-zA-Z]+$");
        return p.matcher(s).matches();
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        // your code here
                Pattern p = Pattern.compile("^[a-zA-Z].*\\d$");

        return p.matcher(s).matches();

    }
    
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
                Pattern p = Pattern.compile("A{3,}");
                return p.matcher(s).find();

        // your code here
    }

    public static void main(String[] args) throws IOException {
        System.out.println(RegexMatch.containsOnlyAlpha("azejkdfhjsdf"));
        System.out.println(RegexMatch.containsOnlyAlpha("azejkd fhjsdf"));
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6f5"));
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6."));
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAAAAsdjksj"));
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAsdaaasdjksj"));
    }
}