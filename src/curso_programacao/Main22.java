package curso_programacao;

import java.util.Scanner;

public class Main22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite código: ");
		double cod = sc.nextDouble();
		System.out.print("Digite qtde: ");
		double qde = sc.nextDouble();
		
		double total;
		
		if (cod == 1) {
			total = qde * 4.00;
	}	
		else if (cod == 2) {
			total = qde * 4.50;
		}
		else if (cod == 3) {
			total = qde * 5.00;
		}
		else if (cod == 4) {
			total = qde * 2.00;
		}
		else if (cod == 5){
			total = qde * 1.50;
		}
		else {
			total = qde * 0;
			System.out.print("Código não cadastrado.");
			
		}
		System.out.printf("Valor total: R$ %.2f%n", total );
		
		sc.close();
	}

}
