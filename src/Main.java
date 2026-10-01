import java.util.Scanner;
public  class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE MÉDIA");
        System.out.println();
        System.out.print("Digite uma Nota: ");
        double nota = scanner.nextDouble();

        System.out.println("Nota informada: " + nota);

        scanner.close();
    }
}