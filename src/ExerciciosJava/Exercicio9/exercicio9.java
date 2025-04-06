package ExerciciosJava.Exercicio9;

// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//Fórmula do IMC = peso / (altura) ²
//
//Tabela Condições IMC
//
// Abaixo de 18,5   | Abaixo do peso
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
// Entre 25,0 e 29,9 | Levemente acima do peso
// Entre 30,0 e 34,9 | Obesidade grau I
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
//Maior ou igual a 40 | Obesidade grau III (mórbida)

//Finalizado.

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scPeso = new Scanner(System.in);
        System.out.println("Digite seu peso em KG: 9");
        double peso = scPeso.nextDouble();

        Scanner scAltura = new Scanner(System.in);
        System.out.println("Digite sua altura em Metros: ");
        double altura = scAltura.nextDouble();

        double imc = peso/Math.pow(altura, 2);


        if (imc < 18.5){
            System.out.println("Seu IMC é "+ imc + "e você está abaixo do peso");

        }
        else if (imc > 18.5 && imc < 24.9){
            System.out.println("Seu IMC é "+ imc + "e você está com o Peso ideal (parabéns)");

        }
        else if (imc > 24.9 && imc < 29.9){
            System.out.println("Seu IMC é "+ imc + "e você está Levemente acima do peso");

        }
        else if (imc > 29.9 && imc < 34.9){
            System.out.println("Seu IMC é "+ imc + "e você está Obesidade grau I");

        } else if (imc > 34.9 && imc < 39.9) {
            System.out.println("Seu IMC é "+ imc + "e você está Obesidade grau II (severa)");
        } else {
            System.out.println("Seu IMC é "+ imc + "e você está Obesidade grau III (mórbida)");
        }


    }
}
