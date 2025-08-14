import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        // your code here
		        // your code here
		if (args == null || args[0]== null){
			return;
		}

		InputStream reader = System.in;
		OutputStream file = new FileOutputStream(args[0]);
		byte[] buffer = new byte[1024];
		int n ;
		while ((n = reader.read(buffer)) != -1) {
			file.write(buffer, 0, n);
		}
		file.close();
    }
}
