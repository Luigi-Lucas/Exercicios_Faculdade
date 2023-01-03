package Exercicios_Satoshi;

import javax.swing.*;

//Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

public class Exercicio_8 {

    public static void main(String[] args) {

        double D, R;

        D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));

        R = D * 1.013;

        JOptionPane.showMessageDialog(null, "O valor rendeu $" + R + " em 1 mês");
    }
}
