import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("digite os três lados do triângulo:");

            System.out.print("lado 1: ");
            double lado1 = scanner.nextDouble();

            System.out.print("lado 2: ");
            double lado2 = scanner.nextDouble();

            System.out.print("lado 3: ");
            double lado3 = scanner.nextDouble();

            if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("o triângulo é equilátero.");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("o triângulo é isósceles.");
                } else {
                    System.out.println("o triângulo é escaleno.");
                }
            } else {
                System.out.println("os valores fornecidos não formam um triângulo válido.");
            }
        } catch (Exception e) {
            System.out.println("ocorreu um erro. Certifique-se de digitar valores válidos.");
        } finally {
            scanner.close();
        }
    }
}
