package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Produtos;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produtos> lista = new ArrayList<>();

		System.out.print("Enter file path: ");
		String strPath = sc.nextLine();

		File sourceFile = new File(strPath);
		String sourceFolder = sourceFile.getParent();

		boolean sucess = new File(sourceFolder + "/out").mkdir();
		
		String targetFile = sourceFolder + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(";");

				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);
				
				Produtos prod = new Produtos(name, price, quantity ); 
				lista.add(prod);
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
				
				for ( Produtos prod : lista) {
					bw.write(prod.getName() +"," + String.format("%.2f", prod.total()));
					bw.newLine();
				}
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

			
		} catch (IOException e) {
			System.out.println("Error Reading File:" + e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
