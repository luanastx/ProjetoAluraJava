package projeto;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaFilme = 0;
        double notaFilme = 0;
        int totalNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Digite a nota do filme ou sair -1: ");
            notaFilme = leitura.nextDouble();

            if (notaFilme != -1) {
                mediaFilme += notaFilme;
                totalNotas++;
            }
        }
        System.out.println("A média das notas é: " + mediaFilme / totalNotas);
    }

}
