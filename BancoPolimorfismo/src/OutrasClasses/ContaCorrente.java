package OutrasClasses;

public class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
    }
}
