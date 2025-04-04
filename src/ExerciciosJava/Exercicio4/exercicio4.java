package ExerciciosJava.Exercicio4;
import java.util.Scanner;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
// Finalizado.

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Escreva um numero: ");

        int A = sc1.nextInt();

        int sucessor = A+1;
        int antecessor = A-1;

        System.out.println("Seu numero é : "+A+ " seu antecessor é:  "+antecessor+ " e seu sucessor é "+ sucessor);

    }
}
