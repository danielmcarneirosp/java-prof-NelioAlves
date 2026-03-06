package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        int n;
        System.out.print("Enter with a Number: ");
        n = sc.nextInt();
        
        Product[] vect = new Product[n];
        double sum = 0, avg =0;
        
        for( int i=0; i <vect.length; i++) {
        	sc.nextLine();
        	System.out.print("Enter a Name: ");
        	String name = sc.nextLine();
        	System.out.print("Enter with a Price: ");
        	double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += price;
        }
        avg = sum / vect.length;
        
        System.out.printf("\nAVERAGE PRICE = %.2f%n", avg);
        
        sc.close();
        
        System.out.println("\nFinla de Processamento!");
        
        		
	}

}
