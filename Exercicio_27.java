package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_27 {

    public static void main(String[] args) {

        //Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
        //Calcule e mostre a velocidade média em km/h.

        double V, M, KM, T, TH, VM;

        V = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas do circuito"));
        M = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros"));
        T = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração do circuito em minutos"));

        TH = T / 60;

        KM = V * (M / 1000);

        VM = KM / TH;

        JOptionPane.showMessageDialog(null, "A velocidade média é igual á " + VM + " Km/h.");
    }
}
