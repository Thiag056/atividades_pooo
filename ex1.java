import java.util.Scanner;

public class ex1 { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        int n4 = sc.nextInt();

        int soma = n1 + n2 + n3 + n4;
        System.out.println("A soma é: " + soma);

        sc.close();
    }
}
