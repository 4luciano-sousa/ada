package exercicios2;

public class Solution3 {

	public static double valorProdutoFinal(double[] input) {
		if (input.length != 2)
			return -1.0;
		double valorProduto = input[0];
		double estado = input[1];
		double imposto;
		switch ((int) estado) {
		case 1:
			imposto = 0.07;
			break;
		case 2:
			imposto = 0.12;
			break;
		case 3:
			imposto = 0.15;
			break;
		default:
			return -1.0;
		}

		double precoFinal = valorProduto * (1 + imposto);

		precoFinal = Math.round(precoFinal * 10000.0) / 10000.0;

		return precoFinal;
	}

	public static void main(String[] args) {
		double[] produto1 = { 250.10, 1.0 };
		double[] produto2 = { 220.50, 3.0 };

		System.out.println("Preço final do produto: " + valorProdutoFinal(produto1));
		System.out.println("Preço final do produto: " + valorProdutoFinal(produto2));
	}

}