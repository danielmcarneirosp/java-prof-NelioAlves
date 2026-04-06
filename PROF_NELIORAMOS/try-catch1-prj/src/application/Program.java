package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the Sentence: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Enter the Position: ");
			int position = sc.nextInt();
			System.out.println("The postion is: "+vect[position]);
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("\nEnd of Program");
	}

}
