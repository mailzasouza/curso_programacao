package curso_programacao;

import java.util.Scanner;

public class Main17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int z = sc.nextInt();		
			
		if(z%n == 0 || n%z ==0 ) 		
		{
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		
		
		sc.close();
		
		
	}

}
