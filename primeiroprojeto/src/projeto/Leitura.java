package projeto;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String nomeFilme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoPublicacao = leitura.nextInt();
        System.out.println("Digite a nota do filme: ");
        double notaFilme = leitura.nextDouble();

        System.out.printf("""
                Filme: %s
                Ano de lançamento: %d
                Nota do filme: %.1f
                %n""", nomeFilme, anoPublicacao, notaFilme);

        leitura.close();
    }
}
