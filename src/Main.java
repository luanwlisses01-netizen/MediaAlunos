import java.util.Scanner;
public  class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE MÉDIA");
        System.out.println();

        System.out.print("Digite a Primeira Nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a Segunda Nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        scanner.close();
    }
}