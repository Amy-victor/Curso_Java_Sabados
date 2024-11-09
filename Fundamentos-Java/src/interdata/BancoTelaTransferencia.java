package interdata;

import javax.swing.JOptionPane;

public class BancoTelaTransferencia {
    // Array estático para armazenar as contas
    private static Conta[] contas = new Conta[6];

    public static void main(String[] args) {
        // Inicialização das contas
        inicializarContas();
        
        // Exemplos de saque
        contas[0].sacar(200); // Eduardo saca R$ 200
        contas[1].sacar(150); // Laura saca R$ 150

        // Exemplos de transferência
        contas[0].transferir(contas[2], 300); // Eduardo transfere R$ 300 para Victor
        contas[3].transferir(contas[4], 100); // Fabiano transfere R$ 100 para Caio

        // Imprimir saldos
        imprimirSaldos();

        // Chama o método de transferência
        realizarTransferencia();
    }

    private static void inicializarContas() {
        contas[0] = new Conta("Eduardo", "001", 1000);
        contas[1] = new Conta("Laura", "002", 1000);
        contas[2] = new Conta("Victor", "003", 1000);
        contas[3] = new Conta("Fabiano", "004", 1000);
        contas[4] = new Conta("Caio", "005", 1000);
        contas[5] = new Conta("Igor", "006", 1000);
    }

    private static void imprimirSaldos() {
        for (Conta conta : contas) {
            conta.imprimirSaldo();
        }
    }

    private static void realizarTransferencia() {
        String contaOrigem = JOptionPane.showInputDialog("Digite o nome do cliente que irá transferir:");
        String contaDestino = JOptionPane.showInputDialog("Digite o nome do cliente que irá receber:");

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser transferido:"));

        Conta origem = null;
        Conta destino = null;

        // Identificar as contas de origem e destino
        for (Conta conta : contas) {
            if (conta.getNomeCliente().equalsIgnoreCase(contaOrigem)) {
                origem = conta;
            } else if (conta.getNomeCliente().equalsIgnoreCase(contaDestino)) {
                destino = conta;
            }
        }

        // Realiza a transferência, se as contas forem encontradas
        if (origem != null && destino != null) {
            origem.transferir(destino, valor);
        } else {
            JOptionPane.showMessageDialog(null, "Conta de origem ou destino inválida.");
        }
    }
}
