package Exercicios_Satoshi;

import javax.swing.*;

//Receba o número da base e do expoente. Calcule e mostre o valor da potência.

public class Exercicio_44 {

    public static void main(String[] args) {

        double B, E, P;

        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base"));
        E = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Expoente"));

        P = Math.pow(B, E);

        JOptionPane.showMessageDialog(null, "Resultado da Potência: " + P);
    }
}
