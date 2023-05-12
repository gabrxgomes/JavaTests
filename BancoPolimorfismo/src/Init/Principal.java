package Init;

import OutrasClasses.ContaBancaria;
import OutrasClasses.ContaCorrente;
import OutrasClasses.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, "João", 1000.0);
        ContaCorrente conta2 = new ContaCorrente(456, "Maria", 500.0);
        ContaPoupanca conta3 = new ContaPoupanca(789, "Pedro", 2000.0, 5.0, 1000.0);
        
        conta1.depositar(500.0);
        conta2.sacar(700.0);
        conta3.sacar(1500.0);
        
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
        System.out.println("Saldo da conta 3: " + conta3.getSaldo());
    }
}
