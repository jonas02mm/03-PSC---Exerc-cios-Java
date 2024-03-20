import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite a nota da 1ª avaliação: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota da 2ª avaliação: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a nota da 3ª avaliação: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A média do aluno é: " + media);

            if (media >= 7) {
                System.out.println("O aluno foi aprovado!");
            } else {
                System.out.println("O aluno foi reprovado.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar números válidos.");
        } finally {
            scanner.close();
        }
    }
}
