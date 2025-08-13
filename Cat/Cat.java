import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        // your code here
		if (args == null){
			return;
		}
		for(String s : args){
			FileInputStream file = new FileInputStream(s);
			byte[] buff = new byte[1024];
			int nb;
			while ((nb = file.read(buff)) != -1) {
				System.out.write(buff, 0, nb);
			}
			file.close();
		}
    }
}