package ExerciciosJava.Exercicio5;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
// Finalizado.

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Escreva seu Sálario aqui: ");
        double salarioReal = sc1.nextDouble();
        double salarioMinimo = 1293.20;

        System.out.println("Valor ganha: "+ (salarioReal/salarioMinimo) + " salarios minimo");
    }
}
