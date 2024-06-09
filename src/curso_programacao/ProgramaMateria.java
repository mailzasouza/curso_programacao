package curso_programacao;

import java.util.Scanner;

public class ProgramaMateria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do aluno:");
		String aluno = sc.next();
		System.out.print("Digite a nota do trabalho: ");
		Double notaTrabalho = sc.nextDouble();
		if (notaTrabalho > 30 || notaTrabalho < 0) {
			System.out.println("A nota do trabalho estar entre 0 e 30");
			System.exit(0);
		}
		System.out.print("Digite a nota da prova: ");
		Double notaProva = sc.nextDouble();
		if (notaProva > 50 || notaProva < 0) {
			System.out.println("A nota do prova estar entre 0 e 50");
			System.exit(0);
		}
		System.out.print("Digite a nota do caderno");
		Double notaCaderno = sc.nextDouble();
		if (notaCaderno > 20 || notaCaderno < 0) {
			System.out.println("A nota do caderno estar entre 0 e 20");
			System.exit(0);
		}

		Double notaFinal = notaTrabalho + notaProva + notaCaderno;
		System.out.println("A nota total do aluno foi: " + notaFinal);
		// if -> se
		// o que esta dentro do parentesis equivale a condição desejada
		// o que estiver dentro das chaves {} equivale ao comanndo desejado caso a
		// condição seja atendida
		if (notaFinal >= 80) {
			System.out.println("O aluno " + aluno + " foi aprovado e ganhou o prêmio.");
		} else if (notaFinal >= 60) {
			System.out.println("O aluno " + aluno + " foi aprovado.");

		} else if (notaFinal >= 40) {
			System.out.println("O aluno " + aluno + " ficou em recuperação.");
		} else {
			System.out.println("O aluno " + aluno + " foi reprovado.");
		}

	}

}
