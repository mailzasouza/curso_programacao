package curso_programacao;

import java.util.Locale;

public class Main3 {
	public static void main(String[] args) {
		//String product1 = "Computer";
		//String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("Computer, whisch price is $ %.2f %n", price1);
		System.out.printf("Office desk, which price is $ %.2f %n %n", price2);
		System.out.printf("Record: %d years old, code %d and gender: %c %n ", age,code, gender);
		System.out.printf("%nMeasue with eight decimal places: %f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
				
	}

}
