
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
				n += sp[i].trim()+" ";
			} else if( fr == sec){
				n+= sp[i].substring(fr+1).trim()+" ";
			} else{
				n+= sp[i].substring(fr +1, sec).trim()+" ";
			}
		}

		return n.trim();
    }
}