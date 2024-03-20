import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o peso em kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura em metros: ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            String situacaoPeso = "";
            if (imc < 20) {
                situacaoPeso = "abaixo do peso";
            } else if (imc >= 20 && imc < 25) {
                situacaoPeso = "peso normal";
            } else if (imc >= 25 && imc < 30) {
                situacaoPeso = "sobrepeso";
            } else if (imc >= 30 && imc < 40) {
                situacaoPeso = "obeso";
            } else {
                situacaoPeso = "peso mórbido";
            }

            System.out.printf("seu IMC é %.2f.\n", imc);
            System.out.println("situação do peso: " + situacaoPeso);

        } catch (Exception e) {
            System.out.println("ocorreu um erro. Certifique-se de digitar números válidos.");
        } finally {
            scanner.close();
        }
    }
}
