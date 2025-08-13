public class DoOp {
    public static String operate(String[] args) {
		if (args.length < 3){
			return null;
		}
		if (args[1]== "+"){
			int i = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if (args[1]== "-"){
				int i = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		if (args[1]== "%"){
				int i = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
			return String.valueOf(i);
		}
		return null;
	}
}