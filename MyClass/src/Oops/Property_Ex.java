package Oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.poi.hsmf.datatypes.PropertiesChunk;

public class Property_Ex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				
		FileReader reader=new FileReader("C:\\Users\\admin\\git\\MyClass\\MyClass\\src\\test.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("firstname"));  
	    System.out.println(p.getProperty("lastname")); 
	    System.out.println(p.getProperty("blog"));
	    System.out.println(p.getProperty("technology"));

	}

}
