package com.principal.ris.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandling {
	
	
	
	public static void main(String args[]){
		
		
		try {
			File file=new File("C:\\User\\NumberFile.txt");   
			FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file  
			System.out.println("file content: ");  
			int r=0;
			ArrayList al = new ArrayList<>(); 
			int array[];
			while((r=fis.read())!=-1)  
			{  
				al.add((char)r);
			}  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
