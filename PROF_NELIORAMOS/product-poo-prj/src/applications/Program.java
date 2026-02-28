package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Product p = new Product();
		int qtd;
		
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		p.name = sc.next();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		p.showProduct();
		
		System.out.printf("\nEnter the number of products to be added in stock: ");
		qtd = sc.nextInt();
		p.addProducts(qtd);
		
		System.out.println(p);
		
		System.out.printf("\nEnter the number of products to be removed from stock: ");
		qtd = sc.nextInt();
		p.removeProduct(qtd);
		
	    System.out.println(p);
		
		System.out.println("\nFinal de Processamento!");
		
		
		sc.close();
		
		

	}

}
