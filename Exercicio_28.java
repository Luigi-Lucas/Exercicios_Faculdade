package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_28 {

    public static void main(String[] args) {

        //Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
        //    Venda Mensal	      Preço Atual	      Preço Novo
        //       <500	             <30	            +10%
        //  >= 500 e <1000	     >= 30 e <80            +15%
        //     >= 1000	            >= 80	             -5%
        //Obs.: para outras condições, preço novo será igual ao preço atual.

        double PA, VM, NP;

        PA = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto"));
        VM = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal do produto"));

        if (VM < 500 & PA < 30) {
            NP = PA * 1.10;
        } else if (VM >= 500 & VM < 1000 & PA >= 30 & PA < 80) {
            NP = PA * 1.15;
        } else if (VM >= 1000 & PA >= 80) {
            NP = PA - (PA * 0.05);
        } else {
            NP = PA;
        }

        JOptionPane.showMessageDialog(null, "Novo Preço: $" + NP);
    }
}
