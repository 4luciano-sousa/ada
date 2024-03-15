package exercicios2;

public class Solution4 {

	public static String geraSequenciaFibonacci(int input) {
		StringBuilder resultado = new StringBuilder();
		if (input == 0) {
			return "0";
		}

		int fib1 = 0;
		int fib2 = 1;
		resultado.append("0, ");
		
		while (fib2 <= input) {
			resultado.append(fib2);
			if (fib2 + fib1 <= input) {
				resultado.append(", ");
			}
			int temp = fib1;
			fib1 = fib2;
			fib2 = temp + fib1;
		}

		return resultado.toString();
	}

	public static void main(String[] args) {
		System.out.println(geraSequenciaFibonacci(4));
		System.out.println(geraSequenciaFibonacci(0));
		System.out.println(geraSequenciaFibonacci(8));
	}
}
