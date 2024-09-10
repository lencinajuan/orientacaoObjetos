import screenmatch.calculo.CalculadoraDeTempo;
import screenmatch.calculo.FiltroRecomendacao;
import screenmatch.models.Episodio;
import screenmatch.models.Filme;
import screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setTitulo("Velozes e Furiosos");
        meuFilme.setSinopse("Corrida de carros tunados maneiros");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracaoEmMinutos(120);

        Filme outroFilme = new Filme();
        outroFilme.setTitulo("Velozes e Furiosos 2");
        outroFilme.setSinopse("Corrida de carros tunados maneiros (de novo)");
        outroFilme.setAnoDeLancamento(2005);
        outroFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        meuFilme.avalia(7.5);

        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setTitulo("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtraRecomendacao(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(400);
        filtro.filtraRecomendacao(episodio);
    }
}
