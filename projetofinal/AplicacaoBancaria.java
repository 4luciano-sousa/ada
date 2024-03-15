package projetofinal;

import java.util.Scanner;

public class AplicacaoBancaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca(0.005);

		int escolha;
		double valor;

		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Consultar saldo");
			System.out.println("4. Sair");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite o valor a depositar:");
				valor = scanner.nextDouble();
				contaCorrente.depositar(valor);
				contaPoupanca.depositar(valor);
				System.out.println("Valor depositado com sucesso!");
				break;
			case 2:
				System.out.println("Digite o valor a sacar:");
				valor = scanner.nextDouble();
				if (contaCorrente.sacar(valor)) {
					System.out.println("Valor sacado da conta corrente com sucesso!");
				} else {
					System.out.println("Saldo insuficiente na conta corrente!");
				}
				break;
			case 3:
				System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
				System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (escolha != 4);

		scanner.close();
	}
}
