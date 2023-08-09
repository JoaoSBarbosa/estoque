# Sistema de Gerenciamento de Estoque em Java 📜☕

Este é um programa Java simples desenvolvido para gerenciar o estoque de produtos. Ele permite a entrada de detalhes do produto, como nome, preço e quantidade em estoque. O programa possibilita realizar ações como exibir informações dos produtos, adicionar itens ao estoque e remover itens do estoque.

## Funcionalidades

- Entrada e armazenamento de informações de produtos (nome, preço, quantidade)
- Exibição de detalhes dos produtos, incluindo o valor total em estoque
- Realização de entrada de itens no estoque e atualização das informações
- Realização de saída de itens do estoque e atualização das informações

## Começando

Para executar este programa, siga os seguintes passos:

1. Clone este repositório em sua máquina local.
2. Abra o projeto em sua IDE Java preferida.
3. Acesse o pacote `entities` e confira a classe `Product` para obter detalhes.
4. Acesse o pacote `application` e abra a classe `Main`.
5. Execute a classe `Main` para iniciar o programa.
6. Siga as instruções na tela para gerenciar seu estoque.

## Estrutura das Classes

O projeto consiste em dois pacotes principais:

1. **entities**: Contém a classe `Product`, responsável por representar os detalhes do produto e suas operações.

```
package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	public Product() {
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// Getter e Setter
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double totalValueInStock() {
		return quantity * price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return "Product data: "
				+name
				+", $ "
				+String.format("%.2f", price)
				+", "
				+quantity
				+" units, Total: $ "
				+String.format("%.2f", totalValueInStock());
	}

}
```

1. **application**: Contém a classe `Main`, que serve como o ponto de entrada do programa e lida com as interações do usuário.

```
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
```

## Uso

1. Insira os detalhes do produto (nome, preço, quantidade) conforme solicitado.
2. Visualize as informações do produto, incluindo o valor total em estoque.
3. Realize a entrada de produtos para adicionar itens ao estoque e atualizar as informações.
4. Realize a saída de produtos para remover itens do estoque e atualizar as informações.

Sinta-se à vontade para explorar e modificar o programa de acordo com suas necessidades.

## Desenvolvedor

Projeto desenvolvido por [João Barbosa](https://joaosbarbosa.com.br/)