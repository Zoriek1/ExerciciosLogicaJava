package ExerciciosJava.Exercicio12.Execution;

import ExerciciosJava.Exercicio12.Domain.computador;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        computador pc = new computador(0, "Computador");
        Scanner sc = new Scanner(System.in);

        double valorTotal = 2000;


        System.out.println("Selecione Abaixo a sua forma de pagamento de preferência");
        System.out.println("--------------------------------------------------------");
        System.out.println("Dinheiro (1): ");
        System.out.println("Cartão de Crédito à vista (2): ");
        System.out.println("Cartão de Crédito em até 2x (3): ");
        System.out.println("Cartão de Crédito em 3x ou mais: ");
        int formaDePagamento = sc.nextInt();

        if (formaDePagamento == 1) {
            System.out.printf("Seu valor a ser pago é: %s%n", valorTotal * 0.85);
        }
       else if (formaDePagamento == 2) {
            System.out.printf("Seu valor a ser pago é: %s%n", valorTotal * 0.9);
        }
        else if (formaDePagamento == 3) {
            System.out.printf("Seu valor a ser pago é: %s%n", valorTotal);
        }
        else if (formaDePagamento == 4) {
            System.out.printf("Seu valor a ser pago é: %s%n", valorTotal * 1.1);
        }
        else{
            System.out.printf("Valor invalído, digite novamente: ");
        }
    }
}
