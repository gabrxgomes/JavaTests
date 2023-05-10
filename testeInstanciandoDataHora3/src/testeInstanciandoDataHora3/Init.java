package testeInstanciandoDataHora3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d04 = LocalDate.parse("2023-05-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-05-10T01:30:26");
		Instant d06 = Instant.parse("2023-05-10T01:30:26Z");// preste a atenção no fuzo orario
		
		//for (String s : ZoneId.getAvailableZoneIds()) {//essa coleçãp nos retorna os nomes customizados dos fuso horarios
			//System.out.println(s); // vai nos printar todos os horarios globais
		//}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());// aqui estamos convertendo o Instant para uma variavel local
		//considerando a data/fuso horario do meu computador
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());// esse instant pega o meu fuso e printa
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));// esse converte o meu fuso horario local e o converte para o de portugal
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);//pelo fato de ser um fuso mais adiantado que o de londres "Z", então a data permanecerá 10/05/23
		
		System.out.println("r3 = " + r3);// printa o nosso fuso local baseado no meu pc 
		
		System.out.println("r4 = " + r4);// printa o nosso fuso convertido no fuso que passamos como parametro
		
		System.out.println("d04 dia = " + d04.getDayOfMonth()); // obtendo o dia de uma data local
		System.out.println("d04 dia = " + d04.getMonthValue());
		System.out.println("d04 dia = " + d04.getYear());
		
		System.out.println("d05 dia = " + d05.getHour());
		System.out.println("d05 dia = " + d05.getMinute());

	}

}
