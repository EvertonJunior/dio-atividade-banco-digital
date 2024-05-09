package dio.desafio.banco.digital;

public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;

	Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
	}

	int getAgencia() {
		return agencia;
	}

	int getNumeroConta() {
		return numeroConta;
	}

	double getSaldo() {
		return saldo;
	}

	void depositar(double valor) {
		saldo += valor;
	}

	void sacar(double valor) {
		saldo -= valor;
	}

	void transferir(Conta contaDestino, double valor) {
		saldo -= valor;
		contaDestino.depositar(valor);
	}

	protected void imprimirInfos() {
		System.out.println("Agencia: " + agencia + " Conta: " + numeroConta);
		System.out.println("saldo: R$ " + saldo);
	}
	
	abstract void imprimirExtrato();

}
