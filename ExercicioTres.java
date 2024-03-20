import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("digite o número de votos brancos: ");
            int brancos = scanner.nextInt();

            System.out.print("digite o número de votos nulos: ");
            int nulos = scanner.nextInt();

            System.out.print("digite o número de votos válidos: ");
            int validos = scanner.nextInt();

            int totalVotos = brancos + nulos + validos;

            double percentualBrancos = (brancos * 100.0) / totalVotos;
            double percentualNulos = (nulos * 100.0) / totalVotos;
            double percentualValidos = (validos * 100.0) / totalVotos;

            System.out.println("percentual de votos brancos: " + percentualBrancos + "%");
            System.out.println("percentual de votos nulos: " + percentualNulos + "%");
            System.out.println("percentual de votos válidos: " + percentualValidos + "%");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar números válidos.");
        } finally {
            scanner.close();
        }
    }
}
