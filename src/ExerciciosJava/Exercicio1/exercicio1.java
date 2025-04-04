package ExerciciosJava.Exercicio1;


//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

// Finalizado.

public class exercicio1 {
    public static void main(String[] args) {


        int A = 5;
        int B = 5;
        int C = 10;

        int soma = A + B;


        if (soma > C){

            System.out.println("O resultado da soma é: "+ soma + " e é maior que "+ C);
        }
        else if (soma == C){
            System.out.println("O resultado da soma é: "+ soma + " e é igual a "+ C);
        }
        else {
            System.out.println("O resultado da soma é: "+ soma + " e é menor que: "+ C);
        }

    }
}
