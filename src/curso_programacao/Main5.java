package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2;
		int quantidade1, quantidade2;
		double valor1, valor2, total;
		
		System.out.print("Digite o código: ");
			codigo1 = sc.nextInt();
		System.out.print("Digite quantidade: ");	
			quantidade1 = sc.nextInt();	
		System.out.print("Digite valor unitario: ");	
			valor1 = sc.nextDouble();	
		System.out.print("Digite o código: ");
			codigo2 = sc.nextInt();
		System.out.print("Digite quantidade: ");	
			quantidade2 = sc.nextInt();
		System.out.print("Digite valor unitario: ");	
			valor2 = sc.nextDouble();
			//Double total1;
		total = quantidade1 * valor1 + quantidade2 * valor2;
		System.out.println("Valor total = "+ total);
		
		
		
		sc.close();
}
	
}


