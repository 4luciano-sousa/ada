package projetofinal;

public class ContaBancaria {

	protected double saldo;

	public ContaBancaria() {
		saldo = 0.0;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}
}
