package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> lista = new ArrayList<>();
		
		
		IO.print("Enter the number of Products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Product #" + i + " data: ");
			sc.nextLine();
			IO.print("Common, Used or Imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
		
			if ( c == 'i') {
				IO.print("Name: ");
				String name = sc.nextLine();
				IO.print("Price: ");
				double price = sc.nextDouble();
				IO.print("Customs fee: ");
				double fee = sc.nextDouble();
				lista.add(new ImportProduct(name,price,fee));
				
			}else if (c == 'c') {
				IO.print("Name: ");
				String name = sc.nextLine();
				IO.print("Price: ");
				double price = sc.nextDouble();
				lista.add(new Product(name,price));
				
			}else if(c =='u') {
				IO.print("Name: ");
				String name = sc.nextLine();
				IO.print("Price: ");
				double price = sc.nextDouble();
				IO.print("Manufactoure Date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				lista.add(new UsedProduct(name,price,manufactureDate));
			}
			
		}
		
		System.out.println("\n\nORICE TAGS:");
		for (Product obj : lista) {
			System.out.println(obj.priceTag());
		}
		
		sc.close();
		System.out.println("\nFINAL DE PROCESSAMENTO!");

	}

}
