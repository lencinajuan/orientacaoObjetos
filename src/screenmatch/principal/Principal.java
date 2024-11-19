package screenmatch.principal;

import screenmatch.calculo.CalculadoraDeTempo;
import screenmatch.calculo.FiltroRecomendacao;
import screenmatch.models.Episodio;
import screenmatch.models.Filme;
import screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Velozes e Furiosos", 2005, "Corrida de carros tunados maneiros", 120, true, 10);
        //meuFilme.setTitulo("Velozes e Furiosos");
        //meuFilme.setSinopse("Corrida de carros tunados maneiros");
        //meuFilme.setAnoDeLancamento(2005);
        //meuFilme.setDuracaoEmMinutos(120);

        Filme outroFilme = new Filme("Velozes e Furiosos 2", 2006, "Corrida de carros tunados maneiros (de novo)", 140, true, 10);
        //outroFilme.setTitulo("Velozes e Furiosos 2");
        //outroFilme.setSinopse("Corrida de carros tunados maneiros (de novo)");
        //outroFilme.setAnoDeLancamento(2006);
        //outroFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        meuFilme.avalia(7.5);

        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie("Lost", 2000, "Tão tudo perdido no mato", 5000, true, 10);
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

        Filme maisFilme = new Filme("Velozes e Furiosos 3", 2007, "Corrida de carros tunados e legais (de novo novamente)", 130, true, 10);
        //maisFilme.setDuracaoEmMinutos(130);
        //maisFilme.setTitulo("Velozes e Furiosos 3");
        //maisFilme.setAnoDeLancamento(2007);
        //maisFilme.setSinopse("Corrida de carros tunados e legais (de novo novamente)");
        maisFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(maisFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme: " + listaDeFilmes.get(0).getTitulo());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

        Object objeto = listaDeFilmes;
    }
}
