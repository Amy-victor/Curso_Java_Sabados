package interdata;

public class Banco {

    static Contax[] contas;

    public static void main(String[] args) {
        contas = new Contax[100];
        contas[0] = new Contax();
        contas[0].nomeCliente = "Alexsandro";
        contas[0].numeroConta = "123";
        contas[0].saldo = 500;
        contas[0].imprimirSaldo();

        contas[1] = new Contax();
        contas[1].nomeCliente = "Diego";
        contas[1].numeroConta = "456";
        contas[1].saldo = 100;
        contas[1].imprimirSaldo();

        contas[1].sacar(100);
        contas[1].depositar(50);

        contas[1].imprimirSaldo();
        contas[1].imprimirSaldo();
        
        for (Contax conta : contas) {
            if(conta != null){
                conta.imprimirSaldo();
            }
        }

        tranferir(contas[0], contas[1], 50);
    }

    public static void tranferir(Contax origem, Contax destino, double valor){
        if(origem.saldo >= valor){
            origem.sacar(valor);
            destino.depositar(valor);
        }else{
            System.out.print("Saldo insuficiente!");
        }
    }

    public static Contax buscarConta(String usuario, String senha){
        for (Contax conta : contas) {
            if(conta.nomeCliente.equals(usuario)){
                return conta;
            }
        }
        return null;
    }




}
