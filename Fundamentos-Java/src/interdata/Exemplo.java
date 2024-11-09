package interdata;

import javax.swing.JOptionPane;

public class Exemplo {

public static void main(String[] args) {
    String contaOrigem = JOptionPane.showInputDialog("Digite algo");

    // Imprimir o que for digitado
    System.out.println("Você digitou = " + contaOrigem);

}
}
