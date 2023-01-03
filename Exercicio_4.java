package Exercicios_Satoshi;

import javax.swing.*;

//Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

public class Exercicio_4 {

    public static void main(String[] args) {

        double C, F;

        C = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius"));

        F = (9 * C + 160) / 5;

        JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit é igual á " + F);

    }

}
