public class StringConcat {
    public static String concat(String s1, String s2) {
        // your code here
		if(s1 == null){
			s1= "";
		}
		if (s2 == null) {
			s2="";
		}
		if (s1.isEmpty() && s2.isEmpty()){
			return null;
		}
		return s1+s2;
    }
}