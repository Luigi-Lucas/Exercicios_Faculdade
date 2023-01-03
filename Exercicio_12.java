package Exercicios_Satoshi;

import javax.swing.*;

//Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.

public class Exercicio_12 {

    public static void main(String[] args) {

        int NA, AT, ID, FT;

        NA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de Nascimento"));
        AT = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));

        ID = AT - NA;
        FT = ID + 17;

        JOptionPane.showMessageDialog(null, "Idade atual: " + ID + "\nIdade daqui á 17 anos: " + FT);
    }
}
