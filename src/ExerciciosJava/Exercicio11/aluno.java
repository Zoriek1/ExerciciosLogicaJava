package ExerciciosJava.Exercicio11;

public class aluno {
    private String nome;
    private int idade;
    private double[] notas;
    private double media;


    public aluno() {
        this.nome = nome;
        this.notas = notas;
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void imprimeNotas() {
        System.out.println("##########Resultado##########");

        System.out.println("Seu Nome é : "+getNome());

        System.out.println("Suas notas foram : ");
        for (int i = 0; i < getNotas().length; i++) {
            System.out.print("Nota "+(i + 1)+" = "+getNotas()[i]+", ");
        }
        System.out.println();
        String mediaFormatada = String.format("%.2f", getMedia());

        System.out.println("Seu Resultado é: ");
        if (getMedia() >= 7 && getMedia() <= 10) {
            System.out.println("Parabéns você passou de ano, sua média foi:  "+ mediaFormatada);
        }
        else if (getMedia() < 7 && getMedia() >= 0) {
            System.out.println("Infelizmente você não passou, sua média foi: "+mediaFormatada);
        }
        else {
            System.out.println("Sua média não é valida, tente denovo");
        }


        System.out.println("Parabéns : )");



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
