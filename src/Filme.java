public class Filme {
    String titulo;
    String sinopse;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Título do filme: " + titulo);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        //System.out.println("Avaliação do filme: " + somaDasAvaliacoes);
        //System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
}
