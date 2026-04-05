package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		List<Employee> lista = new ArrayList<>(); 
	   		
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			
			sc.nextLine();
			System.out.println("Employee #"+i + " data:");
					
			IO.print("Outsource (y/n)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			IO.print("Name: ");
			String name = sc.nextLine();
			
			IO.print("Hours: ");
			int hours = sc.nextInt();
			
			IO.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (c == 'y') {
				IO.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				
				Employee out = new OutsourceEmployee(name, hours, valuePerHour,additionalCharge);
				lista.add(out);
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);	
				lista.add(emp);
			}
			
		}
		
		
		System.out.println("\n\nPAYMENTS:");
		for (Employee obj : lista) {
			
			System.out.println(obj.getName() + " - $ " + String.format("%.2f", obj.payment()));
		}
		
		sc.close();

	}

}
