import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("digite a descrição do produto: ");
            String descricao = scanner.nextLine();
            System.out.print("digite a quantidade adquirida: ");
            int quantidade = scanner.nextInt();

            System.out.print("digite o preço unitário: ");
            double precoUnitario = scanner.nextDouble();

            double total = quantidade * precoUnitario;

            double desconto = 0.0;
            if (quantidade <= 5) {
                desconto = total * 0.02;
            } else if (quantidade <= 10) {
                desconto = total * 0.03;
            } else if (quantidade < 30) {
                desconto = total * 0.05;
            } else {
                desconto = total * 0.10;
            }

            double totalPagar = total - desconto;

            System.out.println("descrição do produto: " + descricao);
            System.out.println("quantidade adquirida: " + quantidade);
            System.out.println("preço unitário: R$ " + precoUnitario);
            System.out.println("total: R$ " + total);
            System.out.println("desconto: R$ " + desconto);
            System.out.println("total a pagar: R$ " + totalPagar);

        } catch (Exception e) {
            System.out.println("ocorreu um erro. Certifique-se de digitar valores válidos.");
        } finally {
            scanner.close();
        }
    }
}
