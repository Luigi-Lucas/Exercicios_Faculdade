package Exercicios_Satoshi;

import javax.swing.*;

//Receba a base e a altura de um triângulo. Calcule e mostre a sua área.

public class Exercicio_3 {

    public static void main(String[] args) {

        int base, altura, area;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do Triângulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Triângulo"));

        area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do Triângulo é igual á: " + area);
    }
}
