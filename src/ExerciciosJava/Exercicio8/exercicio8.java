package ExerciciosJava.Exercicio8;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
//

import java.util.Arrays;
import java.util.Collections;

public class exercicio8 {

    public static void main(String[] args)  {

        int A = 3;
        int B = 16;
        int C = 9;

        // Criar um array com os números passados.
        int[] numeros = {A,B,C};

        Arrays.sort(numeros);

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }
}
