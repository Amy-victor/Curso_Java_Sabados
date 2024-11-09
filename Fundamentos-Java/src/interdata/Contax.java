package interdata;

public class Contax {

    public String nomeCliente;
    public String numeroConta;
    public double saldo;



    public void sacar(double valor){
        System.out.println("***********************************");
        System.out.println("*****" + nomeCliente + "*********");
        System.out.println("Saque de :" + valor);
        saldo = saldo - valor;
        System.out.println("Saldo atual = " + saldo);
        System.out.println("***********************************");
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Saldo atual = " + saldo);
    }

    public void imprimirSaldo(){
        System.out.println("Saldo atual = " + saldo);
    }

}
