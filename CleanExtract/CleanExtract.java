
public class CleanExtract {
    public static String extract(String s) {
		if (s.isEmpty() || s == null){
			return "";
		}
		String[] sp = s.split("\\|");
			String n= "";

		for (int i= 0 ; i <sp.length; i++){
			int fr = sp[i].indexOf('.');
			int sec = sp[i].lastIndexOf('.');
			if (fr<0){
				n += sp[i]+" ";
			} else if( fr == sec){
				n+= sp[i].substring(fr+1)+" ";
			} else{
				n+= sp[i].substring(fr +1, sec)+" ";
			}
		}
		String[] hold = n.trim().split("\\s+");
		return String.join(" ", hold);
    }
}