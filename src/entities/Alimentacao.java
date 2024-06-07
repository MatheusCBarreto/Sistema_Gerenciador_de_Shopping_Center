package entities;

public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
        estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Informações da loja de Alimentação: " + "\n " +
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
                "Data do Alvara: " + dataAlvara + "\n ";
    }
}
