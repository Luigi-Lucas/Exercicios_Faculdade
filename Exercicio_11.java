package Exercicios_Satoshi;

import javax.swing.*;

//Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.

public class Exercicio_11 {

    public static void main(String[] args) {

        double R, C;

        R = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio de uma Circunferência"));

        C = 2 * Math.PI * R;

        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é igual á " + C);
    }
}
