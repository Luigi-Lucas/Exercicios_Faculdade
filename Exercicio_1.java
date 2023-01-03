package Exercicios_Satoshi;

import javax.swing.*;

//Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

public class Exercicio_1 {

    public static void main(String[] args) {

        int A, Area;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado de um Quadrado"));

        Area = A * A;

        JOptionPane.showMessageDialog(null, "A área do Quadrado é igual á " + Area);
    }

}
