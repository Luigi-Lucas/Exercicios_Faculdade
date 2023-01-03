package Exercicios_Satoshi;

import javax.swing.*;

public class Exercicio_25 {

    public static void main(String[] args) {

        //Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos,
        //sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.

        int HI, HF, MI, MF, TH, TM;

        HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a Hora Inicial do jogo"));
        if (HI >= 24) {
            JOptionPane.showMessageDialog(null, "Digite um Número entre 0 e 23");
            System.exit(0);
        }

        MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o Minuto Inicial do jogo"));
        if (MI >= 60) {
            JOptionPane.showMessageDialog(null, "Digite um Número entre 0 e 59");
            System.exit(0);
        }

        HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a Hora Final do jogo"));
        if (HF >= 24) {
            JOptionPane.showMessageDialog(null, "Digite um Número entre 0 e 23");
            System.exit(0);
        }

        MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o Minuto Final do jogo"));
        if (MF >= 60) {
            JOptionPane.showMessageDialog(null, "Digite um Número entre 0 e 59");
            System.exit(0);
        }

        if (HF > HI) {
            TH = HF - HI;
        } else {
            TH = (24 - HI) + HF;
        }

        if (MF > MI) {
            TM = MF - MI;
        } else {
            TM = MI - MF;
        }
        JOptionPane.showMessageDialog(null, "O jogo durou: " + TH + " Horas " + TM + " Min.");
    }
}

