package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_38 {

    public static void main(String[] args) {

        //Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.

        double i = 0, N, MA, ME;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro Positivo"));

        if (N < 0) {
            JOptionPane.showMessageDialog(null, "O número deve ser positivo.");
            System.exit(0);
        }
        MA = N;
        ME = N;

        do {
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro Positivo"));
            if (N < 0) {
                JOptionPane.showMessageDialog(null, "O número deve ser positivo.");
                System.exit(0);
            }

            i = i + 1;

            if (N > MA) {
                MA = N;
            } else if (N < ME) {
                ME = N;
            }

        } while (i < 99);
        JOptionPane.showMessageDialog(null, "Maior Valor: " + MA + "\nMenor Valor: " + ME);
    }
}
