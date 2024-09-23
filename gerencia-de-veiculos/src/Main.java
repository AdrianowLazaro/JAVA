//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("João", 25, "ABC1234");
        Veiculo carro = new Veiculo("Gol", 2023);

        carro.setMotorista(motorista1);
        carro.acelerar(121);
        carro.exibirInformacoes();
    }

    }
