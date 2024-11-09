package interdata;

public class Banco {

    static Conta[] contas;

    public static void main(String[] args) {
        contas[0] = new ContaCorrente("Alexandro", "001", 500);
        contas[0].imprimirSaldo();

        contas[1] = new ContaPoupanca("Amy", "002", 600);
        contas[1].imprimirSaldo();

        ((ContaCorrente)contas[0]).CobrarTaxa(10);

        ((ContaPoupanca)contas[1]).bonificar();

        contas[0].sacar(100);
        contas[1].depositar(50);

        contas[1].imprimirSaldo();
        contas[1].imprimirSaldo();
        
        for (Conta conta : contas) {
            if(conta != null){
                conta.imprimirSaldo();
            }
        }

        tranferir(contas[0], contas[1], 50);
    }

    public static void tranferir(Conta origem, Conta destino, double valor){
        if(origem.mostrarSaldo() >= valor){
            origem.sacar(valor);
            destino.depositar(valor);
        }else{
            System.out.print("Saldo insuficiente!");
        }
    }

    public static Conta buscarConta(String usuario, String senha){
        for (Conta conta : contas) {
            if(conta.getNomeCliente().equals(usuario)){
                return conta;
            }
        }
        return null;
    }




}
