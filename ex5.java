import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = sc.nextDouble();

        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;

        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);

        sc.close();
    }
}
