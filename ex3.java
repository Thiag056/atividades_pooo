import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double p1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double p2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double p3 = sc.nextDouble();

        double mediaPonderada = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
        System.out.println("A média ponderada é: " + mediaPonderada);

        sc.close();
    }
}
