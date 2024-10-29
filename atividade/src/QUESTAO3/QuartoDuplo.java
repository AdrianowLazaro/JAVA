package QUESTAO3;

public class QuartoDuplo implements Acomodacao, ServicoAdicional{
    private static final double DIARIA = 180.0;

    @Override
    public double calcularDiaria() {
        return DIARIA;
    }

    @Override
    public void exibirDetalhes(int dias) {
        double totalDiaria = calcularDiaria() * dias;
        System.out.printf("Quarto Duplo: Diária R$ %.2f | Total por %d dias: R$ %.2f\n", calcularDiaria(), dias, totalDiaria);
    }

    @Override
    public double calcularServico(int numeroPessoas, boolean limpezaExtra) {
        double custoCafé = numeroPessoas * 20 * (numeroPessoas > 0 ? 1 : 0); // Custo do café
        double custoLimpeza = limpezaExtra ? 30 : 0; // Custo da limpeza extra
        return custoCafé + custoLimpeza;
    }
}
