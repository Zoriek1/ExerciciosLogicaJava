package ExerciciosJava.Exercicio7;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
// Finalizado.

public class exercicio7 {
    public static void main(String[] args) {

        boolean verdadeiro = 2 == 2;
        boolean falso = 3 == 4;


        if (verdadeiro && falso == true){
            System.out.println("ambos são verdadeiros!");
        }else if (verdadeiro && falso == false){
            System.out.println("ambos são falsos!");
        } else {
            System.out.println("um ou outro é falso ou verdadeiro!");
        }

    }
}
