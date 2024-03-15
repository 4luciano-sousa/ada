package projetofinal;

public class ContaPoupanca extends ContaBancaria {

	private double taxaRendimento;

	public ContaPoupanca(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor * (1 + taxaRendimento));
	}
}
