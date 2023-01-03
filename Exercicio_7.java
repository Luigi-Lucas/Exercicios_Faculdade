package Exercicios_Satoshi;

import javax.swing.*;

//Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.

public class Exercicio_7 {

    public static void main(String[] args) {

        int C, L, H, V;

        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento de um Paralelepípedo"));
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura de um Paralelepípedo"));
        H = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura de um Paralelepípedo"));

        V = C * L * H;

        JOptionPane.showMessageDialog(null, "O volume do Paralelepípedo é igual a " + V);
    }
}
