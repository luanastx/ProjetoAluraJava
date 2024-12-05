package projeto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interestelar");

        int anoDePublicacao = 2020;
        System.out.println("Ano de Lançamento: " + anoDePublicacao);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;

        //media das notas do filme
        double mediaFilme = (9.0 + 8.0 + 9.0) / 3;
        System.out.println(mediaFilme);
        String sinopse;
        sinopse = """
                Filme sobre um Homem que embarca em um foguete e voa para fora da terra!!
                Muito bom!!
                Ano de lançamento
                """ + anoDePublicacao;
        /* exemplo
            de
         comentario */

        System.out.println(sinopse);

        //casting - convertendp tipos
        int classificacao = (int) (mediaFilme) / 2;
        System.out.println(classificacao);


    }
}