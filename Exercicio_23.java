package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_23 {

    public static void main(String[] args) {

        //Receba 3 valores obrigatoriamente em ordem crescente e um 4.º valor não necessariamente em ordem.
        //Mostre os 4 números em ordem crescente.

        int A, B, C, D;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo Valor"));

        while (B < A) {
            JOptionPane.showMessageDialog(null, "O valor deve ser digitado em ordem crescente!");
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo Valor Novamente"));
        }

        C = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro Valor"));

        while (C < B | C < A) {
            JOptionPane.showMessageDialog(null, "O valor deve ser digitado em ordem crescente!");
            C = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro Valor Novamente"));
        }

        D = Integer.parseInt(JOptionPane.showInputDialog("Digite um quarto Valor"));

        if (D < A) {
            JOptionPane.showMessageDialog(null, "Ordem Crescente:\n" + D + "\n" + A + "\n" + B + "\n" + C);
        } else if (D > A & D < B) {
            JOptionPane.showMessageDialog(null, "Ordem Crescente:\n" + A + "\n" + D + "\n" + B + "\n" + C);
        } else if (D > B & D < C) {
            JOptionPane.showMessageDialog(null, "Ordem Crescente:\n" + A + "\n" + B + "\n" + D + "\n" + C);
        } else {
            JOptionPane.showMessageDialog(null, "Ordem Crescente:\n" + A + "\n" + B + "\n" + C + "\n" + D);
        }
    }
}
