package QUESTAO2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> frota = new ArrayList<>();

        while (true) {
            System.out.println("Cadastrar veículo (c) ou sair (s)?");
            char opcao = scanner.next().charAt(0);
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 's') {
                break;
            }

            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano de Fabricação: ");
            int anoFabricacao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            System.out.println("Tipo de veículo (carro/caminhao/onibus): ");
            String tipoVeiculo = scanner.nextLine();

            Veiculo veiculo = null;

            switch (tipoVeiculo.toLowerCase()) {
                case "carro":
                    veiculo = new Carro(placa, marca, modelo, anoFabricacao);
                    break;
                case "caminhao":
                    veiculo = new Caminhao(placa, marca, modelo, anoFabricacao);
                    break;
                case "onibus":
                    veiculo = new Onibus(placa, marca, modelo, anoFabricacao);
                    break;
                default:
                    System.out.println("Tipo de veículo inválido.");
                    continue;
            }

            frota.add(veiculo);
            System.out.println("Veículo cadastrado com sucesso!");
        }

        System.out.println("\nDetalhes dos veículos cadastrados:");
        for (Veiculo veiculo : frota) {
            veiculo.exibirDetalhes();
            System.out.println();
        }

        scanner.close();
    }
}
