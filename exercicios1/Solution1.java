package exercicios1;

import java.util.Arrays;

public class Solution1 {

	public static double[] custosCarro(double[] input) {
		double precoFabrica = input[0];
		double custoDistribuidor = input[1];
		double precoImpostos = input[2];

		double percentualDistribuidor = (custoDistribuidor / precoFabrica) * 100;

		double percentualImpostos = (precoImpostos / precoFabrica) * 100;

		percentualDistribuidor = Math.round(percentualDistribuidor * 100.0) / 100.0;
		percentualImpostos = Math.round(percentualImpostos * 100.0) / 100.0;

		return new double[] { percentualDistribuidor, percentualImpostos };
	}

	public static void main(String[] args) {

		double[] entrada1 = { 100000.00, 12000.00, 20000.00 };
		double[] saida1 = custosCarro(entrada1);
		System.out.println("Entrada: " + Arrays.toString(entrada1));
		System.out.println("Saída: " + Arrays.toString(saida1));

		double[] entrada2 = { 115500.00, 25000.00, 32500.00 };
		double[] saida2 = custosCarro(entrada2);
		System.out.println("Entrada: " + Arrays.toString(entrada2));
		System.out.println("Saída: " + Arrays.toString(saida2));
	}
}