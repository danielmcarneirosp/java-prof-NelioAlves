package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite um Número: ");
			vect[i] = sc.nextInt();
		}
		int contador = 0;
		System.out.println("\nNÚMEROS PARES:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				contador+=1;
			}
	
		}
		System.out.println("\n\nQUANTIDADE DE PARES = "+contador);
		
		sc.close();
		System.out.println("\nFinal de Processamento!");
	}

}
