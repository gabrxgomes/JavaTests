
package Init.src.herança;
//i


public class Aluno extends Pessoa {
    
    private String Rgm;
    
    public Aluno(String nome, int anoNascimento, String email, String Rgm){
        super(nome, anoNascimento, email);
        this.Rgm = Rgm;
    }
    
  
    
    public String getRgm(){
        return Rgm;
    }
    public void setRgm(String Rgm){
        this.Rgm = Rgm;
    }
    
} 
