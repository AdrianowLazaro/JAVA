import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

        // Incluir dados de conta
        System.out.println("Criar conta poupança ou especial? (p/e)");
        char tipo = scanner.next().charAt(0);
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Nome do cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Número da conta: ");
        String numeroConta = scanner.nextLine();

        if (tipo == 'p') {
            System.out.print("Dia de rendimento: ");
            int diaRendimento = scanner.nextInt();
            contas.add(new ContaPoupanca(cliente, numeroConta, diaRendimento));
        } else if (tipo == 'e') {
            System.out.print("Limite: ");
            double limite = scanner.nextDouble();
            contas.add(new ContaEspecial(cliente, numeroConta, limite));
        }

        // Depositar
        System.out.print("Valor a depositar: ");
        double valorDeposito = scanner.nextDouble();
        for (ContaBancaria conta : contas) {
            conta.depositar(valorDeposito);
            System.out.println("Depósito realizado com sucesso!");
        }

        // Sacar
        System.out.print("Valor a sacar: ");
        double valorSaque = scanner.nextDouble();
        for (ContaBancaria conta : contas) {
            if (conta.sacar(valorSaque)) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saque não realizado. Saldo insuficiente.");
            }
        }



        // Calcular novo saldo para contas poupança
        System.out.print("Digite a taxa de rendimento: ");
        double taxaRendimento = scanner.nextDouble();
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).calcularNovoSaldo(taxaRendimento);
            }
        }

        // Mostrar dados das contas
        for (ContaBancaria conta : contas) {
            System.out.println("Cliente: " + conta.getCliente());
            System.out.println("Número da Conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.getSaldo());
        }

        scanner.close();
    }

}
