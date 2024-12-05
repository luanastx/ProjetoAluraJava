package exercices;

import java.util.Scanner;

public class MenuCalculo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println(" MENU ");
            System.out.println("1 - calcular area do quadrado");
            System.out.println("2 - calcular area do circulo");
            System.out.println("3 - sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = sc.nextInt();
                double area = lado * lado;
                System.out.println("A área do quadrado é: " + area);
            } else if (opcao == 2) {
                System.out.println("Digite o raio do circulo: ");
                double raio = sc.nextInt();
                double area = 3.14 * raio * raio;
                System.out.println("A área do circulo é: " + area);
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }

        }
    }
}
