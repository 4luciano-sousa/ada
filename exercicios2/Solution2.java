package exercicios2;

public class Solution2 {

	public static String mediaAproveitamento(double[] input) {
		if (input.length != 4)
			return "Tamanho do array de entrada inválido";

		double media = (input[0] + input[1] + input[2]) / 3;
		double mediaFinal = 0.7 * media + 0.3 * input[3];

		if (mediaFinal >= 9.0) {
			return "A";
		} else if (mediaFinal >= 7.5) {
			return "B";
		} else if (mediaFinal >= 6.0) {
			return "C";
		} else if (mediaFinal >= 4.0) {
			return "D";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {
		double[] notas1 = { 8.0, 7.0, 8.0, 8.0 };
		double[] notas2 = { 5.0, 4.3, 8.0, 7.0 };

		System.out.println("Conceito do aluno: " + mediaAproveitamento(notas1));
		System.out.println("Conceito do aluno: " + mediaAproveitamento(notas2));
	}
}
