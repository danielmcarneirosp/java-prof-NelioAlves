package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			
			IO.print("Enter a Folder Path: ");
			String strPath = sc.nextLine();
			
			File path = new File(strPath);
			
			File[] folders = path.listFiles(File::isDirectory);
			
			System.out.println("\nFOLDERS");
			for( File folder : folders) {
				System.out.println(folder);
			}
			
		    File[] files = path.listFiles(File::isFile);
		  	System.out.println("\nFILES");
		  	for ( File file : files) {
		  		System.out.println(file);
		  	}
		  	System.out.print("\nEnter a sub-folder:");
		  	String sub = sc.nextLine();
		  	
		  	boolean success = new File(strPath + sub).mkdir();
		  	System.out.println("\nDirectory created successfully: " + success);
		  	
		}
		catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("\nEnd of Program.");
		}
		

	}

}
