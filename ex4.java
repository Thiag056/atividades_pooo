import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.25;
        System.out.println("O novo salário é: " + novoSalario);

        sc.close();
    }
}
