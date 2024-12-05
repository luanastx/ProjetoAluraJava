package desafiofinal;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Luana";
        double saldo = 1000.00;
        String tipoConta = "Conta Corrente";

        System.out.println("-------------------------");
        System.out.println("Bem vindo ao Banco Screen Match");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("-------------------------");

        int option = 0;

        Scanner sc = new Scanner(System.in);
        String menu = """
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber valor
                4 - Sair
                """;

        while (option != 4) {
            System.out.println(menu);
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Saldo atualizado: " + saldo);
            } else if (option == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferencia = sc.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Transferência realizada com sucesso! Novo saldo: " + saldo);
                }
            } else if (option == 3) {
                System.out.println("Digite o valor a ser recebido: ");
                double valorRecebido = sc.nextDouble();
                saldo += valorRecebido;
                System.out.println("Valor recebido com sucesso! Novo saldo: " + saldo);
            } else if (option != 4) {
                System.out.println("Opção inválida");
            }

        }


    }
}
