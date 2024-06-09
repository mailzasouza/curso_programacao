package curso_programacao;

import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
			x = 5;
			y = 0;
				
			while (x > 2) { 
				x = sc.nextInt();
				System.out.println(x);
				System.out.println(y);
				y = y + x;
				x = x - 1;
			}
		
				
		sc.close();			
		}
	}
		


