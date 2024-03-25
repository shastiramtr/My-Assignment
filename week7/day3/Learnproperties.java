package week7.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Learnproperties {
	public static void main(String[] args) throws IOException {
		//step :1 create a object for file input streame and in the constructor pass the properties file
		FileInputStream file = new FileInputStream("./src/main/resources/Credentails.properties");
		//step:2 create a object for properties class from java.util
		Properties prop = new Properties();
		// step :3 load the fis into the properties
		prop.load(file);
		//step :4 using key we can get a value for the providived key
		String uname = prop.getProperty("username");
		System.out.println(uname);
		String username = prop.getProperty("username" , "demo");
		System.out.println(username);
		System.out.println(prop.getProperty("password"));
		
	}
}



