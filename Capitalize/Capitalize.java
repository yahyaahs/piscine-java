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
		while ((n = file1.read(s))!= -1) {
			file2.write(s, 0, n);
		}
		file1.close();
		file2.close();
	
    }
}