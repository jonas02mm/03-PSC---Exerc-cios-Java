import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("QUAL A IDADE DA PESSOA?: ");
            int idade = scanner.nextInt();

            if (idade < 16) {
                System.out.println("não é eleitor(a).");
            } else if (idade >= 16 && idade <= 17) {
                System.out.println("eleitor(a) facultativo(a).");
            } else if (idade >= 18 && idade <= 65) {
                System.out.println("eleitor(a) obrigatório(a).");
            } else {
                System.out.println("eleitor(a) facultativo(a).");
            }
        } catch (Exception e) {
            System.out.println("ocorreu um erro. Certifique-se de digitar uma idade válida.");
        } finally {
            scanner.close();
        }
    }
}
