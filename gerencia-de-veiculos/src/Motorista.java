public class Motorista {

    private String nome;
    private int idade;
    private String licenca;


    public Motorista() {
        this.nome = "Não definido";
        this.idade = 0;
        this.licenca = "Não possui";
    }


    public Motorista(String nome, int idade, String licenca) {
        if (idade < 18) {
            throw new IllegalArgumentException("O motorista deve ter mais de 18 anos.");
        }
        this.nome = nome;
        this.idade = idade;
        this.licenca = licenca;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }
}
