package dio.desafio.banco.digital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();

		while (true) {

			System.out.println("Bem vindo ao Banco Digital");

			System.out.println();
			System.out.println("1 - Abrir conta ");
			System.out.println("2 - Acessar conta ");
			System.out.println("3 - Sair");

			int opcao = scanner.nextInt();
			if (opcao == 1) {
				banco.abrirConta();
				banco.acessarConta();
			}

			else if (opcao == 2) {
				banco.acessarConta();
			}
			
			else if (opcao == 3) {
				System.out.println("Saindo...");
				break;
			}
		}
		
		scanner.close();
	}
}
