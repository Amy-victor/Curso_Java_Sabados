package interdata;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nomeCliente, String numeroConta, double saldoInicial){
        super(nomeCliente, numeroConta, saldoInicial);
    }
    public double Bonificar(){
        saldo += saldo*0.05;
        return saldo;
    }
}