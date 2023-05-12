package OutrasClasses;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.setSaldo(saldo);
    }
    
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }
    
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
