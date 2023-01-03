package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_20 {

    public static void main(String[] args) {

        //Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
        //Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.

        double A, B, C, D, X1, X2;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C"));

        D = Math.pow(B, 2) - 4 * A * C;

        if (D < 0) {
            JOptionPane.showMessageDialog(null, "Não existem Raízes Reais");
        } else {
            X1 = (-B + Math.sqrt(D)) / (2 * A);
            X2 = (-B - Math.sqrt(D)) / (2 * A);
            JOptionPane.showMessageDialog(null, "X1: " + X1 + "\nX2: " + X2);
        }
    }
}
