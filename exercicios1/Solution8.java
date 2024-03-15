package exercicios1;

public class Solution8 {

	public static String parImpar(int[] numeros) {
		int countPares = 0;
		int countImpares = 0;

		for (int num : numeros) {
			if (num % 2 == 0) {
				countPares++;
			} else {
				countImpares++;
			}
		}
		String pluralPares = countPares == 1 ? "par" : "pares";
		String pluralImpares = countImpares == 1 ? "ímpar" : "ímpares";

		return countPares + " " + pluralPares + ", " + countImpares + " " + pluralImpares;
	}

	public static void main(String[] args) {
		int[] numeros1 = { 1, 2, 3, 6, 9 };
		int[] numeros2 = { 2, 3, 6 };

		System.out.println("Exemplo 1:");
		System.out.println("Entrada: 1, 2, 3, 6, 9");
		System.out.println("Saída: " + parImpar(numeros1));

		System.out.println("\nExemplo 2:");
		System.out.println("Entrada: 2, 3, 6");
		System.out.println("Saída: " + parImpar(numeros2));
	}
}