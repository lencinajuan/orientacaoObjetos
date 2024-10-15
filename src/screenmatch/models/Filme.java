package screenmatch.models;

import screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

     public Filme(String titulo, int anoDeLancamento) {
        this.setTitulo(titulo);
        this.setAnoDeLancamento(anoDeLancamento);
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
        return "Filme: " + this.getTitulo() + " (" + this.getAnoDeLancamento() + ")";
    }
}
