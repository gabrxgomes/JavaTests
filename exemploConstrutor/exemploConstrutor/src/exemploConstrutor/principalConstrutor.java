package exemploConstrutor;
import classConstrutor.constructExempl;
public class principalConstrutor {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		constructExempl genericName = new constructExempl();
		
		System.out.println(genericName.name); //ja que nao setamos valores esse teste 
		//nos retorna um valor padrao para uma classe construtora.
		
		System.out.println(genericName.price);//ja que nao setamos valores esse teste 
		//nos retorna um valor padrao para uma classe construtora.
		
		System.out.println(genericName.quantity);//ja que nao setamos valores esse teste 
		//nos retorna um valor padrao para uma classe construtora.

	}
	
}
