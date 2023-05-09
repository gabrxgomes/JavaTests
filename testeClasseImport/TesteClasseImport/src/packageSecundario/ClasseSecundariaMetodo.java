package packageSecundario;

// METODO QUE VAMOS PUXAR O VALOR DO RETORNO NA NOSSA CLASSE PRINCIPAL
//AQUI NA CLASSE SECUNDARIA QUE SERA ONDE VAMOS FAZER O NOSSO METODO PARA 
//PUXAR APENAS A NOSSA OPERAÇÃO PARA A CLASSE PRINCIPAL
public class ClasseSecundariaMetodo {
	
	//Definimos as variaveis que vamos usar e compartilhar 
	//
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double AreaCalculo() {
		double p = (ladoA + ladoB + ladoC)/2;
		
		return p;// AQUI É EXTREMAMENTE IMPORTE COLOCAR UM RETORNO 
		// NÃO É UM VOID ENTAO O METODO É OBRIGATORIO RETORNAR ALGO
		
		//UM METODO QUE NAO RETORNA NADA É OQUE? UM PROCEDIMENTO
	}

}
