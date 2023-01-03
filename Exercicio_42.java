package Exercicios_Satoshi;

import javax.swing.*;

//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

public class Exercicio_42 {

    public static void main(String[] args) {

        double i, j, S = 0;

        for (i = 1; i <= 50; i++) {
            for (j = 1; j <= 99; j += 2) {
                S = S + (i / j);
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado da Série: " + S);
    }
}
