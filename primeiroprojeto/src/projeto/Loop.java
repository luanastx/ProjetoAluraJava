package projeto;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaFilme = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a nota do filme: ");
            notaFilme = leitura.nextDouble();
            mediaFilme += notaFilme;
        }

        System.out.println("A média das notas é: " + mediaFilme / 3);

    }
}
