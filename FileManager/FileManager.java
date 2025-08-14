import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        // your code here
		FileWriter writer = new FileWriter(fileName);
		writer.write(content);
		writer.close();

    }
    public static String getContentFile(String fileName) throws IOException {
        // your code here
		FileReader re = new FileReader(fileName);
		String hold = "";
		int nb;
		char[] buff = new char[1024];
		while((nb = re.read(buff))!= -1){
			hold += new String(buff, 0, nb);
		}
		re.close();
		return hold;
    }
    public static void deleteFile(String fileName) {
        // your code here
		File file = new File(fileName);
		file.delete();
		
    }
}