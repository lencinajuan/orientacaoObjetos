package screenmatch.models;

import screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String titulo, int anoDeLancamento, String sinopse, int duracaoEmMinutos, boolean incluidoNoPlano, int totalDeAvaliacoes){
        super(titulo, anoDeLancamento, sinopse, duracaoEmMinutos, incluidoNoPlano, totalDeAvaliacoes);
    }

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getTitulo() + " (" + this.getAnoDeLancamento() + ")" + " Sinopse: " + this.getSinopse() + " Tempo de duração (minutos): " + this.getDuracaoEmMinutos();
    }
}
