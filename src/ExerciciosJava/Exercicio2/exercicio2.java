package ExerciciosJava.Exercicio2;
import java.util.Scanner;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
// Finalizado.

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um valor qualquer: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0 && valor > 0) {
            System.out.println("Seu valor: " + valor + " é par e é positivo");
        } else if (valor % 2 == 0 && valor < 0) {
            System.out.println("Seu valor: " + valor + " é par e é Negativo");
        } else if (valor % 2 != 0 && valor > 0) {
            System.out.println("Seu valor: " + valor + " é impar e é positivo");
        } else {
            System.out.println("Seu valor: " + valor + " é impar e é Negativo");


        }
    }
}
