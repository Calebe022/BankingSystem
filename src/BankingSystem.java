import java.util.Scanner;

public class BankingSystem {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== SISTEMA BANCARIO =====");

        int opcao = 0;
        double saldo = 0;
        boolean contaCriada = false;

        int id = 0;
        String nome = "";
        int idade = 0;

        while (opcao != 6) {

            System.out.println("\n1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Retirar");
            System.out.println("4 - Ver saldo");
            System.out.println("5 - Buscar usuário");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            if (opcao == 6) {
                System.out.println("Saindo do sistema bancário....");
                break;
            }

            // CRIAR CONTA
            if (opcao == 1) {

                if (!contaCriada) {

                    System.out.print("Crie um ID: ");
                    id = teclado.nextInt();

                    System.out.print("Digite seu nome completo: ");
                    teclado.nextLine();
                    nome = teclado.nextLine();

                    System.out.print("Digite sua idade: ");
                    idade = teclado.nextInt();

                    if (idade >= 18) {
                        System.out.println("Conta criada com sucesso!");
                        contaCriada = true;
                    } else {
                        System.out.println("Conta não criada, você é menor de idade!");
                    }

                } else {
                    System.out.println("Uma conta já foi criada.");
                }
            }

            // DEPOSITAR
            if (opcao == 2) {

                if (!contaCriada) {
                    System.out.println("Crie uma conta primeiro!");
                } else {

                    System.out.print("Digite o valor do depósito: ");
                    double deposito = teclado.nextDouble();

                    saldo = saldo + deposito;

                    System.out.println("Depósito realizado!");
                    System.out.println("Saldo atual: " + saldo);
                }
            }

            // RETIRAR
            if (opcao == 3) {

                if (!contaCriada) {
                    System.out.println("Crie uma conta primeiro!");
                } else {

                    System.out.print("Digite o valor para retirar: ");
                    double saque = teclado.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo = saldo - saque;
                        System.out.println("Saque realizado!");
                        System.out.println("Saldo atual: " + saldo);
                    }
                }
            }

            // VER SALDO
            if (opcao == 4) {

                if (!contaCriada) {
                    System.out.println("Crie uma conta primeiro!");
                } else {
                    System.out.println("Saldo atual: " + saldo);
                }
            }

            // BUSCAR USUÁRIO
            if (opcao == 5) {

                if (!contaCriada) {
                    System.out.println("Nenhuma conta foi criada ainda.");
                } else {

                    System.out.println("\n===== DADOS DO USUÁRIO =====");
                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + idade);
                    System.out.println("Saldo: " + saldo);
                }
            }
        }
    }
}