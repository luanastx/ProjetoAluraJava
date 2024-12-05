package exercices;

import java.util.Scanner;

public class Tabuada14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada dele: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}
