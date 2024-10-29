package QUESTAO2;

public class Caminhao extends Veiculo {
    private static final double VALOR_REDUCAO_ANO = 5000.0;
    private static final double PERCENTUAL_IPVA = 0.015;

    public Caminhao(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosDeUso = 2023 - getAnoFabricacao(); // Supondo que o ano atual seja 2023
        double valorEstimado = Math.max(0, 80000 - (anosDeUso * VALOR_REDUCAO_ANO)); // Exemplo de valor base
        return valorEstimado * PERCENTUAL_IPVA;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.printf("IPVA: R$ %.2f\n", calcularIPVA());
    }
}
