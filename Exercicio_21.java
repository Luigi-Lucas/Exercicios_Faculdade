package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_21 {

    public static void main(String[] args) {

        //Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem conforme a média:
        //a. Se a média for >= 6,0 exibir “APROVADO”;
        //b. Se a média for >= 3,0 e < 6,0 exibir “EXAME”;
        //c. Se a média for < 3,0 exibir “RETIDO”.

        double N1, N2, N3, N4, MA;

        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        N3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
        N4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));

        MA = (N1 + N2 + N3 + N4) / 4;

        JOptionPane.showMessageDialog(null, "Média: " + MA);

        if (MA >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado.");
        } else if (MA >= 3 & MA < 6) {
            JOptionPane.showMessageDialog(null, "Exame.");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }
    }
}
