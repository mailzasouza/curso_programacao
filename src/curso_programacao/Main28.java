package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		double areaX;
		double areaY;
		
		System.out.println("Quais as medidas do triângulo X: ");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2 ;
		areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		System.out.println("Quais as medidas do triângulo Y: ");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (yA + yB + yC) / 2 ;
		
		areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triâgulo X área: %.4f%n" , areaX);
		System.out.printf("Triâgulo Y área: %.4f%n" , areaY);

		if (areaX > areaY) {
			System.out.println("Área X é maior");
		}
		else
			System.out.println("Área Y é maior");
		
		
		
		
		
		sc.close();
		
	}

}
