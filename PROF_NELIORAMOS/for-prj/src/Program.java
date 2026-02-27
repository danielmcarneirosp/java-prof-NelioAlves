import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Entre com um número: ");
		x = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
			soma +=i;
		}
        System.out.println("Valor da Soma: "+soma);
	}

}
