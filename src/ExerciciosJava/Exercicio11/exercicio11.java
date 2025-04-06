package ExerciciosJava.Exercicio11;

// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.


import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio11 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();


        System.out.println("Quantas notas foram: ");
        double QuantNotas = sc.nextInt();

        double[] notas = new double[(int) QuantNotas];
        double somaMedia = 0;


        for (int i = 0; i < QuantNotas; i++) {
            System.out.println("Digite o valor do nota: ");
            double nota = sc.nextDouble();
            notas[i] += nota;
            somaMedia += nota;

        }

        double media = somaMedia/ notas.length;




        aluno aluno = new aluno();
        aluno.setNome(nome);
        aluno.setMedia(media);
        aluno.setNotas(notas);
        aluno.imprimeNotas();


    }
}
