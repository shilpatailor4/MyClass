package Oops;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Accept a string  
        String str = "File Handling in Java using "+ 
                " FileWriter and FileReader"; 
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("output.txt"); 
        BufferedWriter bw = new BufferedWriter(fw);
  
        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("Writing successful"); 
        System.out.println("Buffer Writing");
        //close the file  
        fw.close(); 
        bw.close();
        
	}

}
