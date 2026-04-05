package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<TaxPayer> lista = new ArrayList<>();
		
		System.out.print("Enter the number of Tax Payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
					
			System.out.println("Tax Payer #" + i + " data: ");
			IO.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			if ( ch == 'i') {
				IO.print("Name: ");
				String name = sc.nextLine();
				IO.print("Annual Income: ");
				double annualIncome = sc.nextDouble();
				IO.print("Healt expenditures: ");
				double healtExpenditure = sc.nextDouble(); 	
				lista.add(new Individual(name, annualIncome, healtExpenditure));
				
			} else {
				IO.print("Name: ");
				String name = sc.nextLine();
				IO.print("Annual Income: ");
				double annualIncome = sc.nextDouble();
				IO.print("Number of Employees: ");
				int employee = sc.nextInt();
				lista.add(new Company(name, annualIncome, employee));
		   }
		
		}
		System.out.println("\nTAXES PAID:");
		double sum = 0;
		for( TaxPayer obj : lista) {
			System.out.println(obj.getName() + ": $ " + String.format("%.2f", obj.tax()));
			sum += obj.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum));
		sc.close();
		System.out.println("\nFinal de Processamento.");
		

	}

}
