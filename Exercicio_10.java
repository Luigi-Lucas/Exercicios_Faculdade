package Exercicios_Satoshi;

import javax.swing.*;

//Receba 2 números reais. Calcule e mostre a diferença desses valores.

public class Exercicio_10 {

    public static void main(String[] args) {

        double A, B, D;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite um número Real"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo número Real"));

        D = A - B;

        JOptionPane.showMessageDialog(null, "A diferença entre esses números é igual á " + D);
    }
}
