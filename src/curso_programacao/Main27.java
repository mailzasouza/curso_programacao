package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double salario =sc.nextDouble();
		Double imposto;
		
		
		if (salario <= 2000.00) {
			System.out.println("Isento de IR");
		}
		else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.println("O valor do imposto de 8% é: R$" ); 
		}
		else if (salario <= 4500.00) {
			imposto = (salario - 2000.00) * 0.18;
		}
		else if (salario > 4500.00) {
			imposto = (salario - 2000.00) * 0.28;
		}
		
		else {
			System.out.println();
		}
		
				
		
		
	sc.close();	
		
	}
}
