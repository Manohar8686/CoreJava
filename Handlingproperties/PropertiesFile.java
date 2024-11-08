package Handlingproperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args)  {
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\CoreJava\\src\\Handlingproperties\\dbconfig.properties");
		System.out.println("Current working directory: " + System.getProperty("user.dir"));
		f.delete();
		
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(f);
		Properties p = new Properties();
		p.setProperty("url", "localhost");
		p.setProperty("username", "root");
		p.setProperty("password", "root");
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.store(fos, "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
