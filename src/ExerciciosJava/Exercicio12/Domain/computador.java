package ExerciciosJava.Exercicio12.Domain;

public class computador {
    private String nome;

    public computador(double valor, String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimeNome() {
        System.out.println("Nome de seu Pc: " + nome);

    }
}

