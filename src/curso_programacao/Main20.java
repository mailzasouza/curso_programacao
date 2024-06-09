package curso_programacao;

import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que horas o jogo começou? ");
		int x = sc.nextInt();
		System.out.print("Que horas o jogo terminou? ");
		int y = sc.nextInt();
		int duracao;
		
		if( x < y ) {
			duracao = y - x;
		}
		else {
			duracao = 24 - x + y;
		}
		
		System.out.print("O JOGO DUROU "+ duracao + " HORAS");
		
		sc.close();
		
	}
	
	

}