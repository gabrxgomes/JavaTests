package Conversor;
import java.util.Locale;
import Principal.TestaPrograma;

public class converterDolarReal {
	
	public static final double Taxa = 6;
	
	
	
	
	
	
	public static double CalculoConversaoTaxa(double valorInputDolar) {
		
		return valorInputDolar * Taxa / 100;
		
		
	}
	
	
	public static double RegradeTres(double CalculoConversaoTaxa, double valorInputDolar) {
		
		return CalculoConversaoTaxa + valorInputDolar;
	}
	
	
	public static double ValorConvertido(double RegradeTres, double valorRealAtual) {
		
		return RegradeTres * valorRealAtual; 
	}
	
	

}
