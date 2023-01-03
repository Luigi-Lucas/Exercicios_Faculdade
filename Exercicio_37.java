package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_37 {

    public static void main(String[] args) {

        //Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

        int i, N, A = 1, B = 0, Aux;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro"));

        for (i = 0; i <= N; i++) {
            System.out.println(A);
            Aux = A;
            A = A + B;
            B = Aux;
        }
    }
}
