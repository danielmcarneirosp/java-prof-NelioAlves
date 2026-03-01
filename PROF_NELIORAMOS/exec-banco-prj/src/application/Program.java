package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String Holder;
		
		System.out.print("Enter Account Number: ");
		int Number = sc.nextInt();
		
		System.out.print("Enter Account Holder: ");
		sc.nextLine();
		Holder = sc.nextLine();
		
		System.out.print("Is there an initial Deposit (y/n)? ");
		char deposit = sc.next().charAt(0);
		
		Bank B;
		
		if (deposit == 'y') {
			System.out.print("Enter initial Deposit Value: ");
			double depositValue = sc.nextDouble();
			B = new Bank(Number,Holder,depositValue);
		} else {
			B = new Bank(Number,Holder);
		}
		
		System.out.println("\nAccount data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",B.getAccountNumber(),B.getAccountHolder(),B.getAccountBalance());
		
		System.out.print("\nEnter a Deposit Value: ");
		double deposito = sc.nextDouble();
		B.deposit(deposito);
		
		B.showBalance();
		
		System.out.print("\nEnter a Withdraw Value: ");
		double saque = sc.nextDouble();
		B.sake(saque);
		
		B.showBalance();
		
		sc.close();
		
		System.out.println("\nFinal de Processamento!");
		
		

	}

}
