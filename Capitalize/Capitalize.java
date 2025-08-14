import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // your code here
		if (args.length != 2 || args == null){
			return;
		}
		FileReader file1 = new FileReader(args[0]);
		FileWriter file2 = new FileWriter(args[1]);
		char[] s = new char[1024];
		int n;
		String holder = "";
		while ((n = file1.read(s))!= -1) {
			holder += new String(s, 0, n);
		}
		String[] split = holder.split("\\s+");
		for(int i = 0; i<split.length; i++){
			if(split[i].isEmpty()){
				continue;
			}
			if(split.length >1){
				split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1);
			}else{
				split[i] = split[i].substring(0).toUpperCase();
			}
		}
		file2.write(String.join(" ", split));
		// System.out.println(String.join(" ", split));
		file1.close();
		file2.close();
	
    }
}