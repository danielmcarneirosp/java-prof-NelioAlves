package application;

import java.util.Locale;
import java.util.Scanner;

import entites.People;

public class Program {
	
	public void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº. pessoa:\n",i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new People(name, age, altura);	
						
		}
		double avg =0, sum = 0, percPessoas16 = 0;
		int pessoaMenos16 = 0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getAltura();
			if( vect[i].getIdade() < 16) {
				pessoaMenos16 +=1;
			}
		}
		
		avg = sum / vect.length;
		System.out.printf("\nAltura Média: %.2f%n",avg);
		percPessoas16 = ((double)pessoaMenos16 / vect.length) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",percPessoas16);
		
		for (int i = 0; i < vect.length; i++) {
			
			if( vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		
	}

}
