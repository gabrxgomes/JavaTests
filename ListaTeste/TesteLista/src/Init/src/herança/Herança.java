
package Init.src.herança;


public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa("Ana", 1990, "ana@mail.com");
        
        System.out.println(p1.getNome());
        
        Aluno a1 = new Aluno("jao", 1996, "jao@mail.com", "ajfhinhfu");
        
        System.out.println(a1.getRgm());
        
    }
    
}
