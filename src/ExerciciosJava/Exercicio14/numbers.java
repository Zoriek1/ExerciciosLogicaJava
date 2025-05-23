package ExerciciosJava.Exercicio14;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu valor A: ");
        double A = sc.nextDouble();
        System.out.println("Digite seu valor B: ");
        double B = sc.nextDouble();

        if (A == B) {
            System.out.printf("Digite Valores diferentes: A = %.2f B = %.2f", A, B);
        }
        else {
            System.out.println("Seu valor A é: "+ B);
            System.out.println("Seu valor B é: "+ A);
        }
    }
}
