package Init;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("nome1");
		list.add("nome2");
		list.add("nome3");
		list.add("xome4");
		list.add("xome5");
		list.add(2,"jome6");
		//o valor na frente é o indice, voce passa ele antes para colocar
		//na posição que voce deseja
		
		//System.out.println(list.size()); // printa o tamanho da lista
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		//System.out.println("---------------------");
		
		//------------------------------------------------------------
		//list.remove(1); // tera que remover o "nome2" e ira remover ! - REMOVE POR POSIÇÃO
		//------------------------------------------------------------
		//podemos mandar remover usando um predicado, que é um indicativo tipo "nomes que começam com M"
		//list.removeIf(x -> x.charAt(0) == 'n'); // REMOVENDO POR PREDICADO
		
		//for (String x : list) {
			//System.out.println(x);
		//}
		
		
		// VAMOS FILTRAR A LISTA PARA MANTER DETERMINADOS TIPOS DE VALORES QUE CORRESPONDEM A UM PREDICADO
		//System.out.println("------------------------------");
		//System.out.println("O indice do usuario xome 4: " + list.indexOf("xome4"));
		
		//List<String> result = list.stream().filter(x -> x.charAt(0) == 'n').collect(Collectors.toList());
		//for (String x : result) {
			//System.out.println(x);
		//}
		
		// --------------------- finalizando o sistema de filtragem------------------//
		
		//---------------- filtrando o primeiro elemento com as seguintes caracteristicas -----------------//
						  //------------------ nos retorna apenas um elemento -----------//
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);

	}

}
