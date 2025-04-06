package ExerciciosJava.Exercicio10;
// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
//

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite aqui suas 3 notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double[] notas = {nota1, nota2, nota3};

        System.out.println("Sua média é: "+ (nota1+nota2+nota3)/notas.length);

    }
}
