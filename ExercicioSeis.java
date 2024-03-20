import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("escolha uma estação do ano:");
            System.out.println("1 - primavera");
            System.out.println("2 - verão");
            System.out.println("3 - outono");
            System.out.println("4 - inverno");

            System.out.print("Digite o número da estação desejada (1 a 4): ");
            int numeroEstacao = scanner.nextInt();

            switch (numeroEstacao) {
                case 1:
                    System.out.println("você escolheu a Primavera.");
                    System.out.println("aa Primavera é uma estação de transição entre o inverno e o verão " +
                            "caracterizada pelo desabrochar das flores e pelo aumento da temperatura.");
                    break;
                case 2:
                    System.out.println("você escolheu o Verão.");
                    System.out.println("o Verão é a estação mais quente do ano " +
                            "marcada pelo calor intenso e dias mais longos.");
                    break;
                case 3:
                    System.out.println("você escolheu o Outono.");
                    System.out.println("o Outono é uma estação de transição entre o verão e o inverno " +
                            "caracterizada pela queda das folhas das árvores e pela temperatura amena.");
                    break;
                case 4:
                    System.out.println("você escolheu o Inverno.");
                    System.out.println("o Inverno é a estação mais fria do ano " +
                            "caracterizada pelo frio intenso, neve e dias mais curtos.");
                    break;
                default:
                    System.out.println("opção inválida. Por favor " +
                            "escolha um número de 1 a 4 correspondente a uma estação do ano.");
            }
        } catch (Exception e) {
            System.out.println("ocorreu um erro. Certifique-se de digitar um número válido.");
        } finally {
            scanner.close();
        }
    }
}
