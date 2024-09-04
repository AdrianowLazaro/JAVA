package AT01;

import java.util.Scanner;

public class Main {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Estoque estoque = new Estoque();

            System.out.println("Dados do produto");
            estoque.mostrarInformacoes();

            System.out.println("Digite a quantidade que deseja dar entrada no estoque: ");
            int entrada = scanner.nextInt();
            estoque.entrada(entrada);

            System.out.println("Dados do produto");
            estoque.mostrarInformacoes();

            System.out.println("Digite a quantidade que deseja retirar do estoque: ");
            int saida = scanner.nextInt();
            estoque.saida(saida);

            System.out.println("Dados do produto");
            estoque.mostrarInformacoes();
        }
    }

