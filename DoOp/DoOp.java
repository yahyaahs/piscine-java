public class DoOp {
	public static String operate(String[] args) {
		if (args == null  || args.length != 3) {
			return "Error";
		}
		
		if (args[0] ==null || args[1]== null || args[2]==null){
			return "Error";
		}
		if ("+".equals(args[1])) {

			int i = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if ("-".equals(args[1])) {
			int i = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if ("%".equals(args[1])) {
			if ("0".equals(args[2])) {
				return "0";
			}
			int i = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if ("/".equals(args[1])) {
			if ("0".equals(args[2])) {
				return "0";
			}
			int i = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if ("*".equals(args[1])) {
			int i = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		return "Error";
	}
}