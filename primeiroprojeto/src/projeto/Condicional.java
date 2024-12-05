package projeto;

public class Condicional {
    public static void main(String[] args) {
        int anoDePublicacao = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        String tipoPlano = "basico";

        if (anoDePublicacao >= 2022) {
            System.out.println("Filme lançado recentemente");
        } else {
            System.out.println("Filme lançado a algum tempo");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("premium")) {
            System.out.println("Filme disponivel para assistir");
        } else {
            System.out.println("Filme não disponivel para assistir");
        }
    }
}
