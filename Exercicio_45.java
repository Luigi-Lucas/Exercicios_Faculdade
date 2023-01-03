package Exercicios_Satoshi;

import javax.swing.*;

//Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225.

public class Exercicio_45 {

    public static void main(String[] args) {

        double i, S = 0;

        for (i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                S = S - (i / (Math.pow(i, 2)));
            } else {
                S = S + (i / (Math.pow(i, 2)));
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado da Série: " + S);
    }
}
