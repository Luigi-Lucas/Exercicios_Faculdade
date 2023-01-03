package Exercicios_Satoshi;

import javax.swing.*;

//Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

public class Exercicio_9 {

    public static void main(String[] args) {

        int A, B;
        double S;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número inteiro"));

        S = Math.pow(A, 2) + Math.pow(B, 2);

        JOptionPane.showMessageDialog(null, "A soma dos quadrados é igual á " + S);
    }
}
