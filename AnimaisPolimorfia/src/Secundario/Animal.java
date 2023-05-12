package Secundario;

public class Animal {
	private String nome;
    private int idade;

	public Animal(String nome, int idade) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
        this.idade = idade;
	}
	public void emitirSom() {
        System.out.println("Animal emitindo som");
    }

}
