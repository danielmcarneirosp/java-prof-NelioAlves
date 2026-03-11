package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de Linhas da Matriz: ");
		int m = sc.nextInt();
		System.out.print("Entre com o número de Colunas da Matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				matriz[i][j] = sc.nextInt();
				
			}			
		}
		System.out.println("\nImprimindo a Matriz Digitada\n");
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
			  System.out.print(matriz[i][j] + " ");
				
			}	
			System.out.println("");
		}
		
		System.out.print("\nInforme um número contido na Matriz: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] == x) {
					System.out.println("\nPosição: "+ i + "," + j + ":");
					
					if( j >0 ) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					
					if( i >0 ) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					
					if(j < matriz[i].length -1) {
						System.out.println("Direita: " + matriz[i][j+1]);
						
					}
					
					if(i < matriz[i].length-1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
					
				}
			}
			
		}

		sc.close();

	}

}
