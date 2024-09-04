package AT01;

public class Estoque {

    private String nome ="Arroz Flora";
    private double preco = 30.00;
    private int quantidade = 4;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço total em estoque: " + valorEmEstoque());
    }

    private double valorEmEstoque(){
        return preco * quantidade;
    }

    public void entrada(int quantidadeEntrada){
        if (quantidadeEntrada > 0){
            quantidade += quantidadeEntrada;
        } else {
            System.out.println("Quantidade de Entrada deve ser positiva");
        }
    }

    public void saida(int quantidadeSaida){
        if (quantidadeSaida > 0){
            if (quantidadeSaida <= quantidade){
                quantidade -= quantidadeSaida;
            } else {
                System.out.println("Quantidade para saída excede a quantidade disponível no estoque.");
            }
        } else {
            System.out.println("Quantidade para saida deve ser positiva!");
        }
    }



}

