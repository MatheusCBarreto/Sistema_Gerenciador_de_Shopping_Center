package entities;

public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
        estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Informações da loja de cosméticos: " + "\n " +
                "Nome da loja: " + getNome() + "\n " +
                "Quantidade de funcionários: " + getQuantidadeFuncionarios() + "\n " +
                "Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n " +
                "--------- Endereço ---------" +
                "Nome da rua: " + getEndereco().getNomeDaRua() + "\n " +
                "Cidade: " + getEndereco().getCidade() + "\n " +
                "Estado: " + getEndereco().getEstado() + "\n " +
                "País: " + getEndereco().getPais() + "\n " +
                "CEP: " + getEndereco().getCep() + "\n " +
                "Número: " + getEndereco().getNumero() + "\n " +
                "Complemento: " + getEndereco().getComplemento() + "\n " +
                "taxaComercializacao: " + taxaComercializacao;
    }
}

