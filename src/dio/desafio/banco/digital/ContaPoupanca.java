package dio.desafio.banco.digital;

public class ContaPoupanca extends Conta{
	
	private Cliente cliente;
	
	
	ContaPoupanca(Cliente cliente) {
		super();
		this.cliente = cliente;
	}


	public Cliente getCliente() {
		return cliente;
	}
	
	@Override
	void imprimirExtrato() {
		System.out.println("---- EXTRATO CONTA POUPANÇA ----");
		System.out.println("Cliente: " + cliente.getNome());
		super.imprimirInfos();
	}
}
