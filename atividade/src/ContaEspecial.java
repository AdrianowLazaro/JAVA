public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String cliente, String numeroConta, double limite) {
        super(cliente, numeroConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
