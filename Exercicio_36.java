package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_36 {

    public static void main(String[] args) {

        //Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

        int N, i, Fat = 1;
        double S = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro"));

        for (i = 1; i <= N; i++) {
            Fat = Fat * i;
            S = S + (1 / (double) Fat);
        }
        JOptionPane.showMessageDialog(null, "O resultado da Série é igual a " + S);
    }
}
