package AT02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = nome;
        funcionario.salario = salario;

        double salarioAntigo = salario;

        funcionario.aplicarAumento();

        System.out.println("\nDados do funcionário após aplicar aumento:");
        funcionario.mostrarSalarios(salarioAntigo);

        scanner.close();
    }


}
