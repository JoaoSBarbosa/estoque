package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		product.setName(sc.nextLine());

		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());

		System.out.print("Quantity in stock: ");
		product.setQuantity(sc.nextInt());

		System.out.println("\nProduct data: " + product);
		System.out.println("\n---------------------------------------------------\n");

		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println("\nUpdate data: " + product);
		System.out.println("\n---------------------------------------------------\n");
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println("\nUpdate data: " + product);
		sc.close();
	}

}
