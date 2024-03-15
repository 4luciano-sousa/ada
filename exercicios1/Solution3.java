package exercicios1;

public class Solution3 {

	public static double custoCompra(int quantidade) {
		double precoUnitario;

		if (quantidade >= 10) {
			precoUnitario = 1.25;
		} else {
			precoUnitario = 1.45;
		}	

		double precoFinal = quantidade * precoUnitario;
		precoFinal = Math.round(precoFinal * 100.0) / 100.0;
		return precoFinal;
	}

	public static void main(String[] args) {
		System.out.println("Exemplo 1:");
		System.out.println("Entrada: 2");
		System.out.println("Saída: " + custoCompra(2));

		System.out.println("Exemplo 2:");
		System.out.println("Entrada: 12");
		System.out.println("Saída: " + custoCompra(12));
	}
}