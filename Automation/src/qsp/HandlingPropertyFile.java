package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// write a program to read the data from the property file
public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/handlingproperty.property");
		//create an object of properties class
		Properties p=new Properties();
		// load the file
		p.load(fis);
		//get the data (or value)by passing the key
		 String url = p.getProperty("url");
		 String un = p.getProperty("username");
		 String pw = p.getProperty("passward");
		 System.out.println(url);
		 System.out.println(un);
		 System.out.println(pw);
		 
		 
		
	}

}
