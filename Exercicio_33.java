package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_33 {

    public static void main(String[] args) {

        //Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

        int N, i;
        double S = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro"));

        for (i = 1; i <= N; i++) {
            S = S + (1 / (double) i);
        }
        JOptionPane.showMessageDialog(null, "O resultado da Série é igual a " + S);
    }
}
