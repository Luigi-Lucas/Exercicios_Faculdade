package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_39 {

    public static void main(String[] args) {

        //Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
        //Casa: 1	2	3	4   ...64
        //Qdte:	1	2	4	8	...	N

        double i = 1, C = 1, Qtd = 0;

        do {
            Qtd = Qtd + C;
            C = C * 2;
            i++;
            System.out.println(Qtd);
        } while (i <= 64);
        JOptionPane.showMessageDialog(null, "A quantidade de grãos no tabuleiro é igual a " + Qtd);
    }
}





