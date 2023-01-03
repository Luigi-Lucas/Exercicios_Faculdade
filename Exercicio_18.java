package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_18 {

    public static void main(String[] args) {

        //Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.

        int A, B, Dif;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor inteiro"));

        if (A > B) {
            Dif = A - B;
        } else {
            Dif = B - A;
        }
        JOptionPane.showMessageDialog(null, "A diferença do maior valor pelo menor é igual á " + Dif);
    }
}
