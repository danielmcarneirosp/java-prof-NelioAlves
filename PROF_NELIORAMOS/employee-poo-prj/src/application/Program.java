package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee emp = new Employee();
		
		System.out.print("Name:");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, $ %.2f%n",emp.name,emp.netSalary());
		
		System.out.print("\nWhich percetage to increase salary? ");
		double perc = sc.nextDouble();
		emp.increaseSalary(perc);
		
		System.out.printf("\nUpdate data: %s, $ %.2f%n",emp.name,emp.netSalary());
		
		
		
		
		System.out.println("\nFinal de Processamento!");
		
		sc.close();
		
		
		
	}

}
