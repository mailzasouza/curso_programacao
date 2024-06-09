package curso_programacao;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		int y = 0;
		
		while (x > 2) {
			y = y + x;
			x = x - 1;
			System.out.print(x);
		}
		
		
		sc.close();

	}

}
