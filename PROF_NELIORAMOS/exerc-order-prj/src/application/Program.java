package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		IO.print("Enter Client Data:\n");
		
		IO.print("Name: ");
		String nameClient = sc.nextLine();
		
		IO.print("E-mail: ");
		String email = sc.next();
		
		IO.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client c1 = new Client(nameClient, email, birthDate);
		
		System.out.println("Enter Order Data:");
		IO.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), c1);
		
		IO.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Enter #" + i + " Item data:");
			sc.nextLine();
			IO.print("Product Name: ");
			String productName = sc.nextLine();
			IO.print("Product Price: ");
			double productPrice = sc.nextDouble();
			IO.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product prod = new Product(productName, productPrice);
			OrderItem item = new OrderItem(quantity, productPrice,prod);
			order.addItem(item);			
			
		}
		
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
	  	
		sc.close();
		

	}

}
