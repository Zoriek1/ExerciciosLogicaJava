// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
package ExerciciosJava.Exercicio13;

import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        p.nome = sc.nextLine();
        System.out.println("Digite seu idade: ");
        p.idade = sc.nextInt();

        System.out.println("seu nome é: " + p.nome);
        if (p.idade >= 18) {
            System.out.printf("Você é Maior de idade: %s", p.idade);


        }
        else {
            System.out.println("Você é menor de idade: " + (p.idade));
        }
    }
}
