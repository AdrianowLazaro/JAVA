package QUESTAO3;
import java.util.Scanner;

public class GerenciadorHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a acomodação (1: Quarto Simples, 2: Quarto Duplo, 3: Suíte): ");
        int escolha = scanner.nextInt();
        System.out.print("Quantos dias você ficará: ");
        int dias = scanner.nextInt();
        System.out.print("Quantas pessoas: ");
        int numeroPessoas = scanner.nextInt();
        System.out.print("Limpeza extra? (true/false): ");
        boolean limpezaExtra = scanner.nextBoolean();

        Acomodacao acomodacao = null;

        switch (escolha) {
            case 1:
                acomodacao = new QuartoSimples();
                break;
            case 2:
                acomodacao = new QuartoDuplo();
                break;
            case 3:
                acomodacao = new Suite();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (acomodacao != null) {
            acomodacao.exibirDetalhes(dias);
            double custoServicos = ((ServicoAdicional) acomodacao).calcularServico(numeroPessoas, limpezaExtra);
            double custoTotal = (acomodacao.calcularDiaria() * dias) + custoServicos;
            System.out.printf("Custo total com serviços: R$ %.2f\n", custoTotal);
        }

        scanner.close();
    }
}
