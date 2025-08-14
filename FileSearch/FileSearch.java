import java.io.*;
public class FileSearch {
    public static String searchFile(String fileName) {
        // your code here
			File dir = new File("documents");
			String path = finder(dir, fileName);
			return path;

	}
	public static String finder(File dir, String filename){
			File[] files = dir.listFiles();
			for(File f : files){
				if(f.isDirectory()){
					String name = finder(f, filename);
					if (name != null){
						return name;
					}
				}
				if (f.isFile() && f.getName().equals(filename)) {
					return f.getAbsolutePath();
				}
			}
			return null;
	}
}