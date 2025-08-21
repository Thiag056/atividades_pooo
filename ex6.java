import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = sc.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;

        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.println("O salário a receber é: " + salarioFinal);

        sc.close();
    }
}
