package exercicios1;

import java.util.Arrays;

public class Solution6 {

	public static String geraRecibo(double[] input) {
		Arrays.sort(input);

		double valorTotal = 0;
		double valorDescontos = 0;

		for (int i = 0; i < input.length; i++) {
			valorTotal += input[i];
			if (i == 0 && input.length >= 2) {
				valorDescontos += input[i] * 0.5; 
			}
		}

		double valorAPagar = valorTotal - valorDescontos;

		String output = String.format("Valor total: %.1f | Valor de descontos: %.1f | Valor a pagar: %.1f", valorTotal,
				valorDescontos, valorAPagar);

		return output;
	}

	public static void main(String[] args) {
		double[] input1 = { 20.0, 40.0 };
		double[] input2 = { 20.0, 40.0, 30.0 };
		double[] input3 = { 20.0, 80.0, 60.0, 40.0 };

		System.out.println("Exemplo 1:");
		System.out.println("Entrada: " + Arrays.toString(input1));
		System.out.println("Saída: " + geraRecibo(input1));

		System.out.println("Exemplo 2:");
		System.out.println("Entrada: " + Arrays.toString(input2));
		System.out.println("Saída: " + geraRecibo(input2));

		System.out.println("Exemplo 3:");
		System.out.println("Entrada: " + Arrays.toString(input3));
		System.out.println("Saída: " + geraRecibo(input3));
	}
}
