package application;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		System.out.print("How manu rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("\n\nRent #" +i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rooms(name, email);
			
			
		}
		
		System.out.println("\n\nBusy Rooms: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i +": "+vect[i]);
			}
		}
		
		sc.close();

	}

}
