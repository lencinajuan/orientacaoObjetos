public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        meuFilme.avalia(7.5);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
    }
}
