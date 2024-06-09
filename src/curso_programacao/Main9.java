package curso_programacao;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Digite um número: ");
		
		int number1 = sc.nextInt();
		
		System.out.print("Este número é: ");
		if (number1 %  2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
					
		
		sc.close();
		
		
	}
}


