package entities;

public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
        estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Informações da loja de vestuário: " + "\n " +
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
                "Produto Importado? " + produtosImportados + "\n ";
    }
}
