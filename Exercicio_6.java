package Exercicios_Satoshi;

import javax.swing.*;

//Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

public class Exercicio_6 {

    public static void main(String[] args) {

        double x, y, aux;

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor y"));

        aux = x;
        x = y;
        y = aux;

        JOptionPane.showMessageDialog(null, "X = " + x + "\nY = " + y);

    }

}
