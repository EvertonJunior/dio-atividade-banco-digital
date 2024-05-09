package dio.desafio.banco.digital;

public class ContaCorrente extends Conta{
	
	private Cliente cliente;

	ContaCorrente(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	void imprimirExtrato() {
		System.out.println("---- EXTRATO CONTA CORRENTE ----");
		System.out.println("Cliente: " + cliente.getNome());
		super.imprimirInfos();
	}
	
	
}
