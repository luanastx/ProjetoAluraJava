package exercices;

import java.util.Scanner;

public class Comparacao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        if (numero == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero > numero2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
}
