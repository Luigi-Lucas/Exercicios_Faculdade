package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_19 {

    public static void main(String[] args) {

        //Receba 2 valores reais. Calcule e mostre o maior deles.

        double A, B;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor Real"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo Valor Real"));

        if (A > B) {
            JOptionPane.showMessageDialog(null, "Maior Valor: " + A);
        } else {
            JOptionPane.showMessageDialog(null, "Maior Valor: " + B);
        }
    }
}
