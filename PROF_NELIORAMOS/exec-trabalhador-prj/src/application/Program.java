package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter Department's Name: ");
		String deptName = sc.nextLine();
		
		Department dep = new Department(deptName);
		
		System.out.println("Enter Worker Data:");
		
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Level: ");
		String workerLevel = sc.next();
		
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, dep);
		
		System.out.print("How many contracts to this Worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Enter Contract #"+i + " data:");
			sc.nextLine();
			IO.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			IO.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();					
			IO.print("Duration (Hours: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println("\n\n");
		System.out.print("Enter Month and Year to calculate income (MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for "+ monthAndYear +": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		sc.close();
	}

}
