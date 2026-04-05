package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Shape> lista = new ArrayList<>();
		
		IO.print("Enter the number of Shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Shape #"+i + " data:");
			IO.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			if(ch =='r') {
				IO.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());
				IO.print("Width: ");
				double width = sc.nextDouble();
				IO.print("Height: ");
				double height = sc.nextDouble();
				lista.add(new Rectangle(color,width, height));
				
			}else {
				IO.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());
				IO.print("Radius: ");
				double radius = sc.nextDouble();
				lista.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape obj : lista) {
			System.out.println(String.format("%.2f", obj.area()));
		}
		
		sc.close();
		
		System.out.println("\nFinal de Processamento!");

	}

}
