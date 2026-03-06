package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("Enter with a Number: ");
		x = sc.nextInt();
		
		double[] vect = new double[x];
		double sum = 0;
		
		for(int i=0; i<x; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / x;
		
		System.out.printf("AVERAGE HIGHT = %.2f%n",avg);
		
		sc.close();
		
		System.out.println("\nFinal de Processamento");
		
		
		

	}

}
