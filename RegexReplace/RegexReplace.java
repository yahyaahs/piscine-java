
public class RegexReplace {
    public static String removeUnits(String s) {
        // your code here
        return s.replaceAll("(\\d+)(cm|$)(?!\\s)", "$1");

    }
    
    public static String obfuscateEmail(String s) {
        // your code here
    }
}