package application;

import java.rmi.StubNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student s = new Student();
		
		s.name = sc.nextLine();
		s.tri1 = sc.nextDouble();
		s.tri2 = sc.nextDouble();
		s.tri3 = sc.nextDouble();
		
		System.out.printf("\nFINAL GRADE = %.2f%n",s.calculaNote());
		System.out.println(s.status(s.calculaNote()));
		
		if(s.calculaNote() < 60) {
			System.out.printf("MISSING %.2f POINTS\n",s.missingGrade(s.calculaNote()));
		}
		
		sc.close();
		
		System.out.println("\nFinal de Processamento.");
		
		
		

	}

}
