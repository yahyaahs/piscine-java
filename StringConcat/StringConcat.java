public class StringConcat {
    public static String concat(String s1, String s2) {
        // your code here
		if(s1 == null){
			s1= "";
		}
		if (s2 == null) {
			s2="";
		}
		return s1+s2;
    }
}