import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        // your code here
		        // your code here
		if (args == null || args[0]== null){
			return;
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer = new FileWriter(args[0]);
		String s;
		while ((s = reader.readLine()) != null) {
			writer.write(s);
			writer.write("\n");
		}
		writer.close();
    }
}
