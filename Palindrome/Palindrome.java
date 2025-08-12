public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
		String n = "";
		for (int i = s.length()-1; i>=0; i--){
			n+= s.charAt(i);
		}

		return s.equals(n);
	}
}