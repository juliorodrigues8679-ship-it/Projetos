import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Situação: APROVADO");
        } 
        else if (media >= 5) {
            System.out.println("Situação: RECUPERAÇÃO");

            System.out.print("Nota da recuperação: ");
            double recuperacao = scanner.nextDouble();

            double novaMedia = (media + recuperacao) / 2;

            System.out.printf("Nova média: %.2f%n", novaMedia);

            if (novaMedia >= 5) {
                System.out.println("Situação final: APROVADO");
            } 
            else {
                System.out.println("Situação final: REPROVADO");
            }
        } 
        else {
            System.out.println("Situação: REPROVADO");
        }

        scanner.close();
    }
}