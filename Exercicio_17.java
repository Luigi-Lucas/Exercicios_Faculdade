package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_17 {

    public static void main(String[] args) {

        /*
        Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
        Receber o tempo de percurso e a velocidade média.
        */

        double T, VM, L;

        T = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em horas"));
        VM = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do percurso"));

        L = (T * VM) / 12;

        JOptionPane.showMessageDialog(null, "Foi gasto " + L + " Litros durante a viajem");
    }
}
