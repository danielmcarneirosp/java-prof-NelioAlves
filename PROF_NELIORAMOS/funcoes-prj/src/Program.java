import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a,b,c;
		System.out.println("Enter with three numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int higher = max(a,b,c);
		showResult(higher);
				
		sc.close();
		
	}
    
	public static int max(int x, int y, int z) {
		
		int result;
		if ( x > y && x > z) {
		   result = x;
		} else if ( y > z) {
			result = y;
		} else {
			result = z;
		}
		return result;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
