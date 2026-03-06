package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número para uma Matriz N/N: ");
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if( mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("Negative Numbers = "+cont);
		sc.close();
	}

}
