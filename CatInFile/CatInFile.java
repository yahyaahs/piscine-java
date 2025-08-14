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
		writer.write(reader.readLine());
		writer.write("\n");
		writer.close();
    }
}
