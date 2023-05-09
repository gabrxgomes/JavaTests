package testeInstanciandoDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um padrao para formatar tipos de texto no input
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 =  Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-05-08");
		
		//podemos colocar o formato de data manualmente também
		LocalDateTime d05 = LocalDateTime.parse("2023-05-08T12:56:35");
		
		
		
		//------------------------------------------------------------------------//
		Instant d06 = Instant.parse("2023-05-08T12:56:35Z"); //Vai nos gerar um horario no padrao UTC
		//com o fuso horario de londres que é o "Z"
		
		
		
		//se quisermos fazer com que o codigo nos faça a conversão direta para algum fuso horario
		Instant d07 = Instant.parse("2023-05-08T12:56:35-03:00");
		
		
		//passando uma data no input para ser formatada de acordo com um modelo pré estabelecido
		LocalDate d08 = LocalDate.parse("08/05/2023", fmt1); //ira printar no formato ISO
		
		LocalDate d09 = LocalDate.parse("08/05/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")); //outro modo de passar os argumentos para formatação
		
		//formatando datas a partir de dados isolados
		LocalDate d10 = LocalDate.of(2023,  5, 9);
		LocalDateTime d11 = LocalDateTime.of(2023, 5, 9, 14, 41);
		
		System.out.println("d01 = " + d01);// implicitamente estamos chamando o to string em todas as chamadas
		System.out.println("d02 = " + d02);// implicitamente estamos chamando o to string em todas as chamadas
		System.out.println("d03 = " + d03);// implicitamente estamos chamando o to string em todas as chamadas
		System.out.println("d04 = " + d04);// implicitamente estamos chamando o to string em todas as chamadas
		System.out.println("d05 = " + d05);// implicitamente estamos chamando o to string em todas as chamadas
		
		// MAS SE CASO QUISERMOS TRANSFORMAR PARA A FORMAÇÃO ISO8601
		System.out.println("/-----------------------------------------------------/");
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07 .toString());// com conversão de horario usando o traço "-" mais a difença do horario
		System.out.println("d08 = " + d08.toString());// converter para o formato ISO
		System.out.println("d09 = " + d09.toString());//outra forma da chamada da conversão para ISO
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		
		

	}

}
