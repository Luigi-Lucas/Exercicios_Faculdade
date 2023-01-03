package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_34 {

    public static void main(String[] args) {

        //Receba um número. Calcule e mostre os resultados da tabuada desse número.

        int i, N, T;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro"));

        for (i = 1; i <= 10; i++) {
            T = N * i;
            System.out.println(N + "x" + i + " = " + T);
        }
    }
}
