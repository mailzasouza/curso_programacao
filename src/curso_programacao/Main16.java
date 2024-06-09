package curso_programacao;

import java.util.Scanner;

public class Main16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o número: ");
		int numero = sc.nextInt();
		
		//int x = numero;
		
		if(numero >= 0) {
			System.out.print("Este número é positivo.");
			
		}
		else  {
			System.out.print("Este número é negativo.");
		}
		sc.close();
	}

}
