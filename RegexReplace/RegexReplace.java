import java.io.IOException;

public class RegexReplace {
    public static String removeUnits(String s) {
        // your code here
        return s.replaceAll("(\\d+)(cm|€)(?=\\s|$)", "$1");
    }

    public static String obfuscateEmail(String s) {
        // your code here
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] parts = s.split("@");
        String user = parts[0];
        String domain = parts[1];
        if (user.length() > 3 && (user.contains("-") || user.contains(".") || user.contains("_"))) {
            String[] subParts = user.split("[-._]");
            user = subParts[0];
            for (int i = 1; i < subParts.length; i++) {
                user += "." +"*".repeat(subParts[i].length());
            }
        } else {
            String firstThree = user.substring(0, 3);
            int starsCount = user.length() - 3;
            String stars = "*".repeat(starsCount);
            user = firstThree + stars;
        }

        String[] domainParts = domain.split("\\.");
        if (domainParts.length == 3) {
            String first = "*".repeat(domainParts[0].length());
            String second = domainParts[1];
            String third = "*".repeat(domainParts[2].length());
            domain = first + "." + second + "." + third;
        } else if (domainParts.length == 2) {
            String first = "*".repeat(domainParts[0].length());
            if (!domainParts[1].equals("com") &&!domainParts[1].equals("net") && !domainParts[1].equals("org")) {
                String second = "*".repeat(domainParts[1].length());
                domain = first + "." + second;
            }else{
                domain = first + "." + domainParts[1];
            }
        }
        return user + "@" + domain;

    }

    // output
    // l lapin jou à la bel ball avec d animau rigolo pour gagner l bill bleu
    // john.***@*******.com
    // jan*@*******.co.***
    // jac***@*******.**
    public static void main(String[] args) throws IOException {
        System.out.println(RegexReplace.obfuscateEmail("john.doe@example.com"));
        // System.out.println(RegexReplace.obfuscateEmail("jann@example.co.org"));
        // System.out.println(RegexReplace.obfuscateEmail("jackob@example.fr"));
    }
}
