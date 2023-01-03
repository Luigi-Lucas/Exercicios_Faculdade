package Exercicios_Satoshi;

//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.

public class Exercicio_41 {

    public static void main(String[] args) {

        int i, j;

        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6; j++) {
                if (i + j == 7) {
                    System.out.println(i + "+" + j + " = 7");
                }
            }
        }
    }
}
