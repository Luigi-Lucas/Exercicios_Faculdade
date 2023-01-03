package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_16 {

    public static void main(String[] args) {

        /*
        Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes.
        Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
        A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
        */

        double SB, SL, HT, VH, PD, NP, DESC;

        HT = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        VH = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora"));
        PD = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto"));
        NP = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes"));

        SB = HT * VH;
        DESC = SB * (PD / 100);
        SL = (SB - DESC) + (NP * 100);

        JOptionPane.showMessageDialog(null, "Salário á receber: $" + SL);
    }
}
