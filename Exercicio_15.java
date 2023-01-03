package Exercicios_Satoshi;

import javax.swing.*;

//Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.

public class Exercicio_15 {

    public static void main(String[] args) {

        double CT1, CT2, H;

        CT1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Cateto Oposto"));
        CT2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Cateto Adjacente"));

        H = Math.sqrt(Math.pow(CT1, 2) + Math.pow(CT2, 2));

        JOptionPane.showMessageDialog(null, "O valor da Hipotenusa é igual á " + H);
    }
}
