package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_24 {

    public static void main(String[] args) {

        //Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

        int A;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro"));

        if (A % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O valor " + A + " é divisível por 2.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + A + " não é divisível por 2.");
        }
        if (A % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O valor " + A + " é divisível por 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + A + " não é divisível por 3.");
        }
    }
}
