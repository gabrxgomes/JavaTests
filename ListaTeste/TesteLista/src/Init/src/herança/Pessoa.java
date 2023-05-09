
package Init.src.herança;


public class Pessoa {
    
    private String nome;
    private int anoNascimento;
    private String email;
    
    
    public Pessoa(String nome, int anoNascimento,String email){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getAnoNascimento(){
        return anoNascimento;
        
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
   
    
}
    
    
    
    
    
    




