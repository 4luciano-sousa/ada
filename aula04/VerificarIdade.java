package aula04;

import java.util.Scanner;
import java.time.Year;

public class VerificarIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Digite o ano de nascimento: ");
			int anoNascimento = scanner.nextInt();

			if (verificarIdade(anoNascimento)) {
				System.out.println("Autorizado. Você pode utilizar o programa.");
				break;
			} else {
				System.out.println("Não autorizado. Entre com um novo ano de nascimento.");
			}
		}

		scanner.close();
	}

	public static boolean verificarIdade(int anoNascimento) {
		int anoAtual = Year.now().getValue();
		int idade = anoAtual - anoNascimento;

		return idade >= 18;
	}

}
