package packagePrincipal;

import java.util.Scanner;

import packageSecundario.ClasseSecundariaMetodo;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nomeScan = new Scanner(System.in);
		
		ClasseSecundariaMetodo formaObj;
		
		
		
		formaObj = new ClasseSecundariaMetodo();
		
		
		
		
		System.out.println("Digite o valor do lado A: ");
		
		formaObj.ladoA = nomeScan.nextDouble();
		
		System.out.println("Digite o valor do lado B: ");
		
		formaObj.ladoB = nomeScan.nextDouble();
		
		System.out.println("Digite o valor do lado C: ");
		
		formaObj.ladoC = nomeScan.nextDouble();
		
		
		
		double resultado = formaObj.AreaCalculo();
		
		System.out.println("o resultado é " + resultado); 
		
		
		
		

	}

}
