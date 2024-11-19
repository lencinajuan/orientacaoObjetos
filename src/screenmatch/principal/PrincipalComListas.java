package screenmatch.principal;

import screenmatch.models.Filme;
import screenmatch.models.Serie;
import screenmatch.models.Titulo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Velozes e Furiosos", 2005, "Corrida de carros tunados maneiros", 120, true, 10);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Velozes e Furiosos 2", 2006, "Corrida de carros tunados maneiros (de novo)", 140, true, 10);
        outroFilme.avalia(8);
        Serie lost = new Serie("Lost", 2000, "Tão tudo perdido no mato", 5000, true, 10);
        Filme maisFilme = new Filme("Velozes e Furiosos 3", 2007, "Corrida de carros tunados e legais (de novo novamente)", 130, true, 10);
        maisFilme.avalia(5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(maisFilme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item);
            if(item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
