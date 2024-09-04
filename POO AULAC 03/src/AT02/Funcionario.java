package AT02;

public class Funcionario {
    String nome;
    double salario;

    public void aplicarAumento() {
        if (salario >= 1 && salario <= 1000) {
            salario += salario * 0.15; // Aumento de 15%
        } else if (salario >= 1001 && salario <= 1500) {
            salario += salario * 0.10; // Aumento de 10%
        } else if (salario >= 1501 && salario <= 2000) {
            salario += salario * 0.05; // Aumento de 5%
        }
    }

    public void mostrarSalarios(double salarioAntigo) {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Salário antigo: R$ %.2f%n", salarioAntigo);
        System.out.printf("Salário atual: R$ %.2f%n", salario);
    }
}
