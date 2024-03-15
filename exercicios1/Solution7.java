package exercicios1;

import java.util.Arrays;

public class Solution7 {

	public static int[] ordenar(int[] dados) {
		Arrays.sort(dados);
		return dados;
	}

	public static void main(String[] args) {
		int[] dados = { 5, 2, 9, 1, 7 };

		System.out.println("Conjunto de dados original: " + Arrays.toString(dados));

		int[] dadosOrdenados = ordenar(dados);

		System.out.println("Conjunto de dados ordenados: " + Arrays.toString(dadosOrdenados));
	}
}
