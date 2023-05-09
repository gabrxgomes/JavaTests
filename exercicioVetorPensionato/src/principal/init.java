package principal;

import java.util.Locale;
import java.util.Scanner;

import infos.infosClientes;

public class init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Locale.setDefault(Locale.US);
		 
		 Scanner sc = new Scanner(System.in);
		 
		 //nao se esqueça de dar o ctrl + shift + o para importar
		 //packages que estejam faltando
		 
		 //agora para testar a nossa classe com as infos
		 //dos hospedes/clientes 1.B
		 
		 
		 //infosClientes ic = new infosClientes("Jao", "jao@gmail.com");
		 // nao se esqueça de importar a classe dos clientes la em cima!
		 
		 //System.out.println(ic);
		 
		 //agora se imprimirmos teremos o nome e email passados no parametro do obj
		 
		 
		 //agora podemos fazer o resto do programa normaalmente apos o teste
		 
		 //---------
		 
		 infosClientes[] vect = new infosClientes[10];// definindo o nosso vetor de 10
		 //posições, lembrando que no momento que nao foi gravado nada em nenhuma posição
		 //todas as posições estao NULL
		 
		 System.out.println("Quantos quartos serao alugados ?");
		 int n = sc.nextInt();// o numero de quartos sera um inteiro, nao tem como alugar 1,5 quartos
		 
		 //agora precisamos de um laço for para percorrer as posições do vetor, para ver oque está null e notnull
		 
		 for (int i =  1; i<=n; i++ ) {
			 System.out.println();
			 System.out.println("Quarto #" + i + ":");
			 System.out.print("Nome: ");
			 sc.nextLine();//isso ajuda a limpar o buffer para fazer a leitura correta
			 String nome = sc.nextLine();
			 
			 System.out.println("Email: ");
			 String email = sc.next();
			 
			 System.out.print("Quarto: ");
			 int numeroQuarto = sc.nextInt();
			 
			 //infosClientes infcli = new infosClientes(nome, email);
			 
			 vect[numeroQuarto] = new infosClientes(nome, email);
			 //AQUI ESTAMOS INSTANCIANDO UM OBJ E PASSANDO UMA REFERENCIA PARA O VETOR
			 //que no caso é o numero do quarto colocando na posição correspondente no vetor
			 
			 
		 }
		 System.out.println();// só pra dar uma quebra de linha
		 System.out.println("Quartos ocupados:");
		 for (int i = 0; i < 10; i++) {
			 
			 if (vect[i] != null) {
				 System.out.println(i + ": " + vect[i]);
			 }
			 else {
				 System.out.println(i + " os nulos: " + vect[i]);
				 //saida para testar o print dos nulos, podemos adaptar para quartos vazios
			 }
			 
			 
		 }
		 
		 
		 
		 
		 sc.close();
		 
				 
				 
				 
		 
		 
		 
	}

}
