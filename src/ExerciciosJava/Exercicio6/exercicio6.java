package ExerciciosJava.Exercicio6;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
// Finalizado.

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Escreva um numero qualquer: ");
        double valor = sc1.nextDouble();

        System.out.println("Seu valor: " +valor  +" com o acrescimo de 5% é: "+ valor*1.05);

    }

}
