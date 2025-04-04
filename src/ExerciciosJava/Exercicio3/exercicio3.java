package ExerciciosJava.Exercicio3;
import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valore, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
// Finalizado.

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int A = sc1.nextInt();
        int B = sc2.nextInt();

        int C = A*B;
        int soma = A + B;

        if (A == B ){
            System.out.println("A + B: "+ soma);
        }
        else {
            System.out.println("Os valores de A e B, a multiplicação deles é C: "+C);
        }
    }}
