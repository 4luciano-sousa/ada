package exercicios1;

public class Solution10 {

	public static double valorEntrada(double[] entrada) {
		double diaSemana = entrada[0];
		double precoNormal = entrada[1];
		double musicaAoVivo = entrada[2];

		if (diaSemana == 1.0 || diaSemana == 2.0 || diaSemana == 4.0) {
			precoNormal *= 0.75;
		}

		if (musicaAoVivo == 1.0) {
			precoNormal *= 1.15;
		}
		precoNormal = Math.round(precoNormal * 1000.0) / 1000.0;

		return precoNormal;
	}

	public static void main(String[] args) {
		double[] entrada1 = { 3.0, 25.00, 2.0 };
		double[] entrada2 = { 4.0, 50.00, 1.0 };

		System.out.println("Exemplo 1:");
		System.out.println("Entrada: [3.0, 25.00, 2.0]");
		System.out.println("Saída: " + valorEntrada(entrada1));

		System.out.println("\nExemplo 2:");
		System.out.println("Entrada: [4.0, 50.00, 1.0]");
		System.out.println("Saída: " + valorEntrada(entrada2));
	}
}