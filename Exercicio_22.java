package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_22 {

    public static void main(String[] args) {

        //Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

        int A, B;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo Valor Inteiro"));

        if (A == B) {
            JOptionPane.showMessageDialog(null, "Os valores devem ser diferentes.");
        } else if (A < B) {
            JOptionPane.showMessageDialog(null, "Ordem Crescente: " + A + "; " + B);
        } else {
            JOptionPane.showMessageDialog(null, "Ordem Crescente: " + B + "; " + A);
        }
    }
}
