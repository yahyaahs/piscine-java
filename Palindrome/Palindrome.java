public class Palindrome {
    public static boolean isPalindrome(String s) {
		if (s.isEmpty() || s == null){
			return true;
		}
        // your code here
		String n = "";
		for (int i = s.length()-1; i>=0; i--){
			n+= s.charAt(i);
		}


		return s.toLowerCase().equals(n.toLowerCase());
	}
}