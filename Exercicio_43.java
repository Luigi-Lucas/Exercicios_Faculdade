package Exercicios_Satoshi;

import javax.swing.*;

//Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria
//sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.

public class Exercicio_43 {

    public static void main(String[] args) {

        double Anos = 0, Ana, Maria;

        Ana = 1.1;
        Maria = 1.5;

        do {
            Anos++;
            Ana += .3;
            Maria += .2;
        } while (Maria > Ana);
        JOptionPane.showMessageDialog(null, "Serão necessários " + Anos + " anos para que Ana seja maior que Maria.");
    }
}
