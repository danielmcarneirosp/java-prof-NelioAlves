package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos número a digitar? ");
        int n = sc.nextInt();
        
        double[] vect = new double[n];
        
        for(int i=0; i<vect.length; i++) {
        	System.out.print("Digite um Número: ");
        	vect[i] = sc.nextDouble();
        }
        double sum = 0, avg =0;
        System.out.print("\nVALORES = ");
        for(int i=0; i<vect.length; i++) {
        	System.out.printf("%.2f ",vect[i]);
        	sum+=vect[i];
        }
        avg = sum / vect.length;
        System.out.printf("\nSOMA = %.2f%n",sum);
        System.out.printf("MEDIA = %.2f%n",avg);
        
        sc.close();
        System.out.println("\nFinal de Processamento!");
        
	}

}
