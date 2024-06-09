package curso_programacao;

import java.util.Scanner;

public class Main14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int DIFabcd = (a * b) - (c * d);
				
		
		System.out.println("Diferença do produto de a e b pelo produto de c e d é: "+ DIFabcd);
		sc.close();
	}

}
