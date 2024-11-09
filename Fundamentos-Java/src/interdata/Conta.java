package interdata;

public class Conta {
	private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public Conta(String nomeCliente, String numeroConta, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public double mostrarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saque de R$ " + valor + " não realizado. Saldo insuficiente.");
            return false;
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$ " + saldo);
    }

    public boolean transferir(Conta contaDestino, double valor) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para a conta " + contaDestino.numeroConta + " realizada.");
            return true;
        } else {
            System.out.println("Transferência de R$ " + valor + " não realizada. Saldo insuficiente.");
            return false;
        }
    }

	public String getNomeCliente() {
		return this.nomeCliente;
	}
}

