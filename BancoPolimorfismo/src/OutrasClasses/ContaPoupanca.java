package OutrasClasses;

public class ContaPoupanca extends ContaBancaria {
    private double taxa;
    private double saldoMinimo;
    
    public ContaPoupanca(int numero, String titular, double saldo, double taxa, double saldoMinimo) {
        super(numero, titular, saldo);
        this.taxa = taxa;
        this.saldoMinimo = saldoMinimo;
    }
    
    @Override
    public void sacar(double valor) {
        if (getSaldo() - valor >= saldoMinimo) {
            setSaldo(getSaldo() - valor);
        } else {
            setSaldo(getSaldo() - taxa);
        }
    }
}