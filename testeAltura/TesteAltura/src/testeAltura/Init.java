package testeAltura;

import java.util.Locale;
import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
			
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma = soma + alturas[i];
		}
		double mediaAlturas = soma / n;
		
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
		sc.close();
	}
	
}
