import java.util.Scanner;
public  class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE MÉDIA");
        System.out.println();

        double somaMedias = 0;

        for (int aluno = 1; aluno <= 5; aluno++) {

            System.out.print("Digite a Primeira Nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a Segunda Nota: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;

            somaMedias = somaMedias + media;

            System.out.println("Média: " + media);

            if (media >= 7) {
                System.out.println("Resultado: APROVADO");
            } else if (media >= 5) {
                System.out.println("Resultado: RECUPERAÇÃO");
            } else {
                System.out.println("Resultado: REPROVADO");
            }
        }

        double mediaTurma = somaMedias / 5;

        System.out.println();
        System.out.println("MÉDIA DA TURMA: " + mediaTurma);

        scanner.close();
    }
}