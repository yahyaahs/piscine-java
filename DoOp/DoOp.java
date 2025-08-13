public class DoOp {
	public static String operate(String[] args) {
		if (args.length != 3) {
			return null;
		}
		if (args[0] ==null || args[1]== null || args[2]==null){
			return null;
		}
		if (args[1] == "+") {

			int i = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if (args[1] == "-") {
			int i = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if (args[1] == "%") {
			if (args[2] == "0") {
				return "0";
			}
			int i = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if (args[1] == "/") {
			if (args[2] == "0") {
				return "0";
			}
			int i = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if (args[1] == "*") {
			int i = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		return null;
	}
}