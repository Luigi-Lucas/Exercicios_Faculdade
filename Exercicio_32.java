package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_32 {

    public static void main(String[] args) {

        //Receba um número inteiro. Calcule e mostre o seu fatorial.

        int i, N, Fat = 1;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro"));

        for (i = 1; i <= N; i++) {
            Fat = Fat * i;
        }
        JOptionPane.showMessageDialog(null,"O Fatorial de " + N + " é igual á " + Fat);
    }
}
