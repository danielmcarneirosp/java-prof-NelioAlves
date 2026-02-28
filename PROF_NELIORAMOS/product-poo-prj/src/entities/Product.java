package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock() {
		return price * quantity;		
	}
	
	public void addProducts(int value) {
		this.quantity += value;
	}
	
	public void removeProduct(int value) {
		this.quantity -= value;
	}
	
	public void showProduct() {
		System.out.printf("\nProduct data: %s, $ %.2f, %d units,Total: $ %.2f%n",name,price,quantity,totalValueStock());
	}
	
	public String toString() {
		return "\nUpdate data: "
			  + name
			  + ", $ "
			  + String.format("%.2f", price)
			  + ", "
			  + quantity
			  + " units, Total: $ "
			  + String.format("%.2f", totalValueStock());
		
	}
	
}
