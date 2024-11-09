package interdata;

public class ContaCorrente extends Conta{
 
    public ContaCorrente(String nomeCliente, String numeroConta, double saldoInicial){
        super(nomeCliente, numeroConta, saldoInicial);
    }
    
    public double cobrarTaxa(double taxa){
    saldo -= taxa;
     return saldo;
    }
}
