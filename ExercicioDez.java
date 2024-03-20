import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lojinha do Sr. Aboo");

        try {
            System.out.print("digite o valor de compra do produto: R$ ");
            double valorCompra = scanner.nextDouble();
            double lucro;
            if (valorCompra < 10.00) {
                lucro = valorCompra * 0.70;
            } else if (valorCompra >= 10.00 && valorCompra <= 30.00) {
                lucro = valorCompra * 0.50;
            } else if (valorCompra > 30.00 && valorCompra <= 50.00) {
                lucro = valorCompra * 0.40;
            } else {
                lucro = valorCompra * 0.30;
            }
            double valorVenda = valorCompra + lucro;
            System.out.printf("porcentagem de lucro: %.2f%%\n", (lucro / valorCompra) * 100);
            System.out.printf("valor de venda: R$ %.2f\n", valorVenda);

        } catch (Exception e) {
            System.out.println("ocorreu um erro. Certifique-se de digitar um valor válido.");
        } finally {
            scanner.close();
        }
    }
}
