package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_35 {

    public static void main(String[] args) {

        //Receba 2 números inteiros, verifique qual o maior entre eles.
        //Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.

        int i, N1, N2, S = 0;

        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Segundo Número Inteiro"));

        if (N1 > N2) {
            for (i = 1; i <= N1 & i >= N2; i++) {
                if (i % 2 != 0) {
                    S = S + i;
                }
            }
            JOptionPane.showMessageDialog(null, "A soma dos Números Ímpares é igual a " + S);
        } else {
            for (i = 1; i <= N2 & i >= N1; i++) {
                if (i % 2 != 0) {
                    S = S + i;
                }
            }
            JOptionPane.showMessageDialog(null, "A soma dos Números Ímpares é igual a " + S);
        }
    }
}
