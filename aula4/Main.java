import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Dados de Cliente
    String nome = "Clarck Kent";
    String tipoConta = "Corrente";
    double saldo = 1500;
    int opcao = 0;

    System.out.println("***********************");
    System.out.println("\n Nome do cliente: " + nome);
    System.out.println("\n Tipo de conta: " + tipoConta);
    System.out.println("\n Saldo: " + saldo);
    System.out.println("\n***********************");

    // Menu Cliente
    System.out.println("**Digite sua opção**");
    System.out.println("1 - Consultar Saldo");
    System.out.println("2 - transferir valor");
    System.out.println("3 - Receber valor");
    System.out.println("4 - Sair");

    Scanner leitura = new Scanner(System.in);
    while (opcao != 4) {
      // Valor recebido do teclado
      opcao = leitura.nextInt();
      // Opçâo
      if (opcao == 1) {
        System.out.println("O saldo é: " + saldo);
      } else if (opcao == 2) {
        System.out.println("Qual valor que deseja transferir?");

        double valor = leitura.nextDouble();
        if (valor > saldo) {
          System.out.println("Saldo insuficiente");
        } else {
          saldo -= valor;
          System.out.println("O novo saldo é: " + saldo);
        }

      } else if (opcao == 3) {
        System.out.println(" Valor a receber:");
        double valor = leitura.nextDouble();
        saldo += valor;
        System.out.println("O novo saldo é: " + saldo);
      } else if (opcao == 4) {
        System.out.println("Opção invalida");
      }

    }
    leitura.close();
    System.out.println("Saindo...");
  }
}