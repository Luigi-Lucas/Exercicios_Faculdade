package Exercicios_Satoshi;

import javax.swing.*;
/*
Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo
que a pessoa consome 50g ao dia.
 */
public class Exercicio_13 {

    public static void main(String[] args) {

        double Q, D;

        Q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimentos em quilos"));

        D = Q / 0.05;

        JOptionPane.showMessageDialog(null, "O alimento durará " + D + " Dias");
    }
}
