package Exercicios_Satoshi;

import javax.swing.*;

//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

public class Exercicio_40 {

    public static void main(String[] args) {

        int i, j, A, B, Div = 0;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite um Segundo Número Inteiro"));

        if (A < B) {
            for (i = A; i <= B; i++) {
                for (j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        Div++;
                    }
                }
                if (Div == 2) {
                    System.out.println(i);
                }
                Div = 0;
            }
        }
    }
}
