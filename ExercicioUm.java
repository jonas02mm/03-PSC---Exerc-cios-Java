import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            if (numero2 == 0) {
                System.out.println("não é possível dividir por zero.");
            } else {
                double resultado = numero1 / numero2;
                System.out.println("o resultado da divisão é: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("ocorreu um erro. digite números válidos.");
        } finally {
            scanner.close();
        }
    }
}
