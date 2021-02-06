package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3MeuEstoque {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();

		int option;
		int dinheiro, valorProduto;
		int total;

		System.out.println("----------Bem-Vindes!!!--------------------------------------");
		System.out.println("Digite a quanto dinheiro você tem: ");
		dinheiro = (int) ler.nextDouble();

		do {
			System.out.println("\n Escolha uma opção: ");
			System.out.println("---------------------------------------------------------");
			System.out.println("(1) Adicionar produto no carrinho.");
			System.out.println("(2) Remover produto no carrinho.");
			System.out.println("(3) Atualizar carrinho.");
			System.out.println("(4) Mostrar todos os produtos no carrinho e seu dinheiro.");
			System.out.println("(5) Finalizar Compras.");
			System.out.println("(0) Sair");
			System.out.println("---------------------------------------------------------");
			option = ler.nextInt();

			switch (option) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome do produto: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				System.out.println("Digite o valor desse produto: ");

				List<Integer> valor = new ArrayList<Integer>();
				valorProduto = ler.nextInt();
				valor.add((int) valorProduto);
				break;

			case 2:
				ler.nextLine();
				System.out.println("Digite o nome do produto que deseja remover: ");
				String produtor = ler.nextLine();

				if (estoque.contains(produtor)) {
					estoque.remove(produtor);
					valor.remove(valorProduto);
				} else {
					System.out.println("Produto inexistente...");
				}
				break;

			case 3:
				ler.nextLine();
				System.out.println("Digite o produto que quer atualizar: ");
				String verificaP = ler.nextLine();
				System.out.println("Digite o nome do produto que entrará no lugar de " + verificaP + " :");
				String novo = ler.nextLine();
				System.out.println("Digite a atualização do preço do " + novo + ".");
				Integer verificaV = ler.nextInt();

				if (estoque.contains(verificaP)) {
					estoque.remove(verificaP);
					estoque.add(novo);
					valor.add(verificaV);
				} else {
					System.out.println("Produto inexistente...");
				}

			case 4:
				System.out.println("Os produtos no carrinho são: ");
				System.out.println(estoque);
				System.out.println("Seus respectivos valores são: ");
				System.out.println(valor);
				break;

			case 5:
				System.out.println("....... Finalizando Compras....");
				System.out.println("Seus produtos são: ");
				System.out.println(estoque);
				System.out.println("Seus respectivos valores são: ");
				System.out.println(valor);

				total = dinheiro - valor;
				// tentei fazer um carrinho de compras mas acabei travando nessa parte..

				System.out.println("Você gastou: " + valor + ".");
				System.out.println("Seu troco: " + total + ".");
				break;

			default:
				System.out.println("Volte sempre!!!");

			}

		} while (option != 0);
	}

}
