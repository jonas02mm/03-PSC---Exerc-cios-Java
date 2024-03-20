import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bem-vindo ao Caixa Eletrônico");
        int opcao;

        do {
            System.out.println("\nescolha uma opção:");
            System.out.println("1. exibir saldo");
            System.out.println("2. exibir extrato");
            System.out.println("3. realizar depósito");
            System.out.println("4. realizar saque");
            System.out.println("5. sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("opção selecionada: Exibir saldo");
                    break;
                case 2:
                    System.out.println("opção selecionada: Exibir extrato");
                    break;
                case 3:
                    System.out.println("opção selecionada: Realizar depósito");
                    break;
                case 4:
                    System.out.println("opção selecionada: Realizar saque");
                    break;
                case 5:
                    System.out.println("opção selecionada: Sair");
                    System.out.println("obrigado por utilizar o Caixa Eletrônico.");
                    break;
                default:
                    System.out.println("opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }

        } while (opcao != 5);
        scanner.close();
    }
}
