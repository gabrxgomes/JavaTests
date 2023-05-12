package Secundario;

public class Pato extends Animal {
    public Pato(String nome, int idade) {
        super(nome, idade);
    }
    
    public void emitirSom() {
        System.out.println("Quack");
    }
}
