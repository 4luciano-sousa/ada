package exercicios1;

public class Solution9 {

	public static double salarioComComissao(double[] input) {
		int quantidadeCarrosVendidos = (int) input[0];
		double valorTotalVendas = input[1];
		double salarioFixo = input[2];
		double valorFixoPorCarro = input[3];

		double comissaoValorTotal = 0.05 * valorTotalVendas;

		double comissaoPorCarro = quantidadeCarrosVendidos * valorFixoPorCarro;

		double salarioTotal = salarioFixo + comissaoValorTotal + comissaoPorCarro;

		salarioTotal = Math.round(salarioTotal * 100.0) / 100.0;

		return salarioTotal;
	}

	public static void main(String[] args) {
		double[] input1 = { 3, 20000.00, 2000.00, 250.00 };
		double[] input2 = { 4, 25000.00, 3500.00, 100.00 };

		System.out.println("Exemplo 1:");
		System.out.println("Entrada: [3, 20000.00, 2000.00, 250.00]");
		System.out.println("Saída: " + salarioComComissao(input1));

		System.out.println("\nExemplo 2:");
		System.out.println("Entrada: [4, 25000.00, 3500.00, 100.00]");
		System.out.println("Saída: " + salarioComComissao(input2));
	}
}
