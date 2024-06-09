
package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double largura = sc.nextDouble();
		Double comprimento = sc.nextDouble();
		Double MetroQuadrado = sc.nextDouble();
		
		Double AREA = largura * comprimento;
		Double PRECO = MetroQuadrado * AREA;
		
		System.out.println("AREA = " + AREA);
		System.out.println("PRECO = " + PRECO);
		
		sc.close();
		
		
	}
}
