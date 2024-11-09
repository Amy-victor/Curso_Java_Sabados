package interdata;

public class ContaCorrente extends Conta{
 
    public ContaCorrente(String nomeCliente, String numeroConta, double saldoInicial){
        super(nomeCliente, numeroConta, saldoInicial);
    }
    
    public double CobrarTaxa(double valor){
     saldo = saldo-valor;
     return saldo;
    }
}
