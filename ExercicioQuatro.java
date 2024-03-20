//nesta correção usei else if em vez de múltiplos if. condição
// seja verdadeira e apenas um aumento seja aplicado.
// e adicionei entrada.close(); para fechar o objeto Scanner após o uso


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double salario = 0.0;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();
        if (salario <= 1000) {
            salario *= taxaAumento3;
        } else if (salario <= 2000) {
            salario *= taxaAumento2;
        } else if (salario <= 3000) {
            salario *= taxaAumento1;
        } else if (salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }
        System.out.printf("Novo salário: R$ %.2f\n\n", salario);
        entrada.close();
    }
}
