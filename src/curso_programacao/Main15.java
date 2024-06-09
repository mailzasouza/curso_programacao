package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

public class Main15 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o número do funcionário: " );
		Double Num = sc.nextDouble();
		System.out.print("Quantas horas ele trabalhou: " );
		Double Hora = sc.nextDouble();
		System.out.print("Qual o valor da hora: " );
		Double Valor = sc.nextDouble();
		
		Double NUMBER = Num;
		Double SALARY = Hora * Valor;
		
		System.out.println("Funcionário número: " + NUMBER);		
		System.out.printf("O Valor do salário do funcionário é: U$ %.2f ", SALARY);
		
		sc.close();
	}

}
