package Exercicios_Satoshi;

import javax.swing.*;

//Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

public class Exercicio_14 {

    public static void main(String[] args) {

        int A1, A2, A3;

        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ângulo de um triângulo"));
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo ângulo de um triângulo"));

        A3 = 180 - (A1 + A2);

        JOptionPane.showMessageDialog(null, "o valor do Terceiro ângulo é igual á " + A3);
    }
}
