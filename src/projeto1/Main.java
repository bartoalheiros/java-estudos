package projeto1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		// substitui o ponto "." pela virgula em numeros decimais
		Locale localeBr = new Locale("pt", "BR");
		Locale.setDefault(localeBr);
		
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
