package Exercicios_Satoshi;

import javax.swing.*;

//Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

public class Exercicio_2 {

    public static void main(String[] args) {

        double Salario, Reajuste;

        Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário do Funcionário"));

        Reajuste = Salario * 1.15;

        JOptionPane.showMessageDialog(null, "O novo Salário do funcionário é: $" + Reajuste);

    }

}
