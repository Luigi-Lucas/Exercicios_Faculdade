package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_29 {

    public static void main(String[] args) {

        //Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
        //Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
        //Demais tipos não serão considerados.

        int INVEST = 0;
        double V, VC;

        V = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
        INVEST = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento"));

        switch (INVEST) {
            case 1:
                VC = V * 1.03;
                JOptionPane.showMessageDialog(null, "Valor Corrigido: $" + VC);
            case 2:
                VC = V * 1.05;
                JOptionPane.showMessageDialog(null, "Valor Corrigido: $" + VC);
        }
    }
}
