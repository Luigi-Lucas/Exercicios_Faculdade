package Exercicios_Satoshi;

public class Exercicio_31 {

    public static void main(String[] args) {

        //Calcule e mostre o quadrado dos números entre 10 e 150.

        int i, Q;

        for (i = 10; i <= 150; i++) {
            Q = (int) Math.pow(i, 2);
            System.out.println("O quadrado de " + i + " é igual á " + Q);
        }
    }
}
