package entities;

public class Bijuteria extends Loja {

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metasVendas) {
        this.metaVendas = metasVendas;
    }

    @Override
    public String toString() {
        return "Informações da loja de Bijuteria: " + "\n " +
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
                "Metas de Vendas " + metaVendas + "\n ";
    }
}
