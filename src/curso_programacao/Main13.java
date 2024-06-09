package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main13 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double MetroQuadrado = sc.nextDouble();
		
		double AREA = largura * comprimento;
		double PRECO = MetroQuadrado * AREA;
		
		System.out.println("AREA = " + AREA);
		System.out.println("PRECO = " + PRECO);
		
		
		sc.close();
}
}