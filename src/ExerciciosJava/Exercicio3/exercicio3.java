package ExerciciosJava.Exercicio3;
import java.util.Scanner;


public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int A = sc1.nextInt();
        int B = sc2.nextInt();

        int soma = A + B;

        if (A == B ){
            System.out.println("A + B: "+ soma);
        }
        else {
            System.out.println("Os valores de A e B são diferentes, coloque valores iguais!");
        }
    }}
