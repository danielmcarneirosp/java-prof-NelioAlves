package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite um Número: ");
			vect[i] = sc.nextDouble();
		}
		double maior=0;
		int indice=0;
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] > maior) {
				maior =  vect[i];
				indice = i;
			}
			
		}
		System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = "+indice);
		
		sc.close();
		System.out.println("\nFinal de Processamento!");
		
	}

}
