package dio.desafio.banco.digital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banco {
	
	Scanner scanner = new Scanner(System.in);

	private Map<Integer, Conta> contas;

	public Banco() {
		this.contas = new HashMap<>();
	}

	public void abrirConta() {
		System.out.println("Criando conta: ");
		System.out.println("1 - Conta corrente ");
		System.out.println("2 - Conta poupança ");
		System.out.println("3 - Conta PJ ");
		int opcao = scanner.nextInt();
		if (opcao == 1) {
			System.out.println("Nome: ");
			scanner.nextLine();
			String nomeCliente = scanner.nextLine();
			Conta novaConta = new ContaCorrente(new Cliente(nomeCliente));
			contas.put(novaConta.numeroConta, novaConta);
			System.out.println("CONTA CRIADA!");
			System.out.println(
					"Bem vindo(a) " + nomeCliente + " AG: " + novaConta.agencia + " CC: " + novaConta.numeroConta);
		} else if (opcao == 2) {
			System.out.println("Nome: ");
			scanner.nextLine();
			String nomeCliente = scanner.nextLine();
			Conta novaConta = new ContaPoupanca(new Cliente(nomeCliente));
			contas.put(novaConta.numeroConta, novaConta);
			System.out.println("CONTA CRIADA!");
			System.out.println(
					"Bem vindo(a) " + nomeCliente + " AG: " + novaConta.agencia + " CC: " + novaConta.numeroConta);
		}

		else if (opcao == 3) {
			System.out.println("Nome da empresa: ");
			scanner.nextLine();
			String nomeEmpresa = scanner.nextLine();
			Conta novaConta = new ContaPj(new Empresa(nomeEmpresa));
			contas.put(novaConta.numeroConta, novaConta);
			System.out.println("CONTA CRIADA!");
			System.out.println(
					"Bem vindo(a) " + nomeEmpresa + " AG: " + novaConta.agencia + " CC: " + novaConta.numeroConta);
		}

	}

	public void acessarConta() {
		
		System.out.println("Digite numero da conta: ");
		int numeroConta = scanner.nextInt();
		
		while (true) {

			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Transferir ");
			System.out.println("4 - Gerar extrato");
			System.out.println("5 - Sair");
			int escolha = scanner.nextInt();
			
			if (escolha == 1) {
				System.out.println("Digite o valor: R$ ");
				double valor = scanner.nextDouble();
				contas.get(numeroConta).depositar(valor);
				;
			} 
			
			else if (escolha == 2) {
				System.out.println("Digite o valor: R$ ");
				double valor = scanner.nextDouble();
				contas.get(numeroConta).sacar(valor);
				;
			} 
			
			else if (escolha == 3) {
				System.out.println("Digite o valor: R$ ");
				double valor = scanner.nextDouble();
				System.out.println("Digite o numero da conta destino: ");
				int contaDestino = scanner.nextInt();
				contas.get(numeroConta).transferir(contas.get(contaDestino), valor);
			} 
			
			else if (escolha == 4) {
				contas.get(numeroConta).imprimirExtrato();
			} 
			
			else if (escolha == 5) {
				System.out.println("Voltando...");
				break;
			}

		}
	}
}
