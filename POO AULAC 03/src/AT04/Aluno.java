package AT04;

import java.util.Scanner;

public class Aluno {

    String nome;
    double nota1; // Nota do primeiro trimestre
    double nota2; // Nota do segundo trimestre
    double nota3; // Nota do terceiro trimestre

    private double lerNota(String trimestre, double maxNota) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        while (true) {
            System.out.printf("Digite a nota do %s trimestre (0 a %.0f):%n", trimestre, maxNota);
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= maxNota) {
                break;
            } else {
                System.out.println("Nota inválida. Tente novamente.");
            }
        }
        return nota;
    }

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        nome = scanner.nextLine();
        nota1 = lerNota("primeiro", 30);
        nota2 = lerNota("segundo", 35);
        nota3 = lerNota("terceiro", 35);
    }

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public void verificarSituacao() {
        double notaFinal = calcularNotaFinal();
        System.out.printf("Nota final de %s: %.2f%n", nome, notaFinal);
        if (notaFinal >= 70) {
            System.out.println("O aluno está aprovado.");
        } else {
            double pontosFaltando = 70 - notaFinal;
            System.out.printf("O aluno está reprovado. Faltaram %.2f pontos para aprovação.%n", pontosFaltando);
        }
    }
}
