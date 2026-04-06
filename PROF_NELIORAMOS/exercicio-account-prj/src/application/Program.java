package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account Data: ");
			IO.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			IO.print("Holder: ");
			String holder = sc.nextLine();
			IO.print("Initial Balance: ");
			double balance = sc.nextDouble();
			IO.print("Withdraw Limit: ");
			double withdraw = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdraw);
			
			IO.print("\nEnter amount for withdraw: ");
			double saque = sc.nextDouble();
			
			acc.withdraw(saque);
			
			System.out.println("\nNew balance: " + String.format("%.2f",acc.getBalance()));
			
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input!");
		}
		catch (DomainException e){
			System.out.println("Withdraw error: " + e.getMessage());
			
		}
		finally {
			sc.close();
			System.out.println("\nEnd of Program.");
		}

	}

}
