package Principal;
import java.util.Scanner;
import Conversor.converterDolarReal;
public class TestaPrograma {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do real: ");
		
		double valorRealAtual = sc.nextDouble();
		
		//usar virgula para entrar o valor double se usar ponto da erro!
		
		System.out.println("O Valor atual do real: " + valorRealAtual);
		
		System.out.println("");
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Digite o valor em dolares que deseja comprar: ");
		
		System.out.println("");
		
		//----------------------------------------------------------------------------
		
		double valorInputDolar = sc.nextDouble();
		
		double k = converterDolarReal.CalculoConversaoTaxa(valorInputDolar);
		
		System.out.println("");
		
		System.out.println(k);
		
		//----------------------------------------------------------------------------
		
		double l = converterDolarReal.RegradeTres(k, valorInputDolar);
		
		double r = converterDolarReal.ValorConvertido(l, valorRealAtual);
		
		System.out.println("O valor em rais que voce tem que pagar: " + r);
		
	}

}
