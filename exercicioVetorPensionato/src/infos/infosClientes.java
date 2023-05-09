package infos;

public class infosClientes {
	
	private String name;
	private String email;
	
	//agora criamos um construtor padrao mesmo lembrando sempre de usar o nome da propria
	//classe pra isso
	
	public infosClientes() {
		
	}

	public infosClientes(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() { //força a conversão pra texto, faça sem e teremos apenas o apontamenmto da memoria
		return name + ", " + email;
	}// para imprimirmos bonitinho as informações, nome seguido do email
	
	//agora podemos ir na nossa classe principal e testar essa nossa classe com as 
	//infos 1.A 
	
	
	
	
}
