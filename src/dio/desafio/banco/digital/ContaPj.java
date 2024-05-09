package dio.desafio.banco.digital;

public class ContaPj extends Conta{

	private Empresa empresa;
	
	ContaPj(Empresa empresa) {
		super();
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	@Override
	void imprimirExtrato() {
		System.out.println("---- EXTRATO CONTA PJ ----");
		System.out.println("Cliente: " + empresa.getNome());
		super.imprimirInfos();
	}

	
}
