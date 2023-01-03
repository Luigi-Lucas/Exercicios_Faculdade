package Exercicios_Satoshi;

import javax.swing.*;
/*
Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais
(considerar que a equação possua 2 raízes).
 */
public class Exercicio_5 {

    public static void main(String[] args) {

        int A, B, C;
        double D, X1, X2;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));

        D = Math.pow(B, 2) - (4 * A * C);

        X1 = (-B + Math.sqrt(D)) / (2 * A);
        X2 = (-B - Math.sqrt(D)) / (2 * A);

        JOptionPane.showMessageDialog(null, "X1 = " + X1);
        JOptionPane.showMessageDialog(null, "X2 = " + X2);

    }
}
