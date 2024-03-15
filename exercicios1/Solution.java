package exercicios1;

public class Solution {

	public static double calculoSalario( double[] input) {

			double tempoServico = input[0];
			double inflacao = input[1];
			double salarioAtual = input[2];
	
			double percentualReajuste = 0.0;
	
			if (tempoServico >= 1 && tempoServico < 5) {
				percentualReajuste += 0.01;
			} else if (tempoServico >= 5 && tempoServico < 10) {
				percentualReajuste += 0.015;
			} else if (tempoServico >= 10) {
				percentualReajuste += 0.02;
			}
	
			double novoSalario = salarioAtual * (1 + percentualReajuste + (inflacao / 100));
	
			novoSalario = Math.round(novoSalario * 100.0) / 100.0;
	
			return novoSalario;
		}
	
		public static void main(String[] args) {
	
			double[] funcionario1 = { 1, 5.0, 2000.00 };
			System.out.println("João da Silva: ");
			System.out.println("Salário atual: R$" + funcionario1[2]);
			System.out.println("Novo Salário: R$" + calculoSalario(funcionario1));
	
			double[] funcionario2 = { 11, 4.5, 2500.00 };
			System.out.println("Maria dos Santos: ");
			System.out.println("Salário atual: R$" + funcionario2[2]);
			System.out.println("Novo Salário: R$" + calculoSalario(funcionario2));

	}
}