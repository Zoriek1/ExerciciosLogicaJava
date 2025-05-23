/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
 */
package ExerciciosJava.Exercicio15;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = LocalDate.now().getDayOfYear();
        System.out.println("Digite seu ano de nascimento: ");
        int anoDeNascimento = sc.nextInt();
        int mes = 30;
        int ano = 365;

            if (anoDeNascimento >= anoAtual){
                System.out.println("Você ainda não nasceu, infelizmente você não viveu nada");
            }
            else{
                System.out.println();
            }
    }
}
