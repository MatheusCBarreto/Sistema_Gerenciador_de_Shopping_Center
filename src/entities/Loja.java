package entities;

import java.util.Arrays;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    Produto[] estoqueProdutos;


    // Construtores
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        estoqueProdutos = new Produto[quantidadeProdutos];
    }

    // Gettrs e Settrs
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Métodos da classe
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public String imprimeProdutos() {
        String infoProduto;
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null) {
                infoProduto = estoqueProdutos[i].getClass().toString();
                return infoProduto;
            }
        }
        return null;
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados da loja: \n " +
                "Nome: " + nome + " \n " +
                "QuantidadeFuncionarios: " + quantidadeFuncionarios + "\n " +
                "SalarioBaseFuncionario: " + salarioBaseFuncionario + "\n\n " +
                "*** Endereco: *** \n " +
                "Rua: " + endereco.getNomeDaRua() + "\n " +
                "Cidade: " + endereco.getCidade() + "\n " +
                "Estado: " + endereco.getEstado() + "\n " +
                "País: " + endereco.getPais() + "\n " +
                "CEP: " + endereco.getCep() + "\n " +
                "Número: " + endereco.getNumero() + "\n " +
                "Complemento: " + endereco.getComplemento() + "\n " +
                "Data de Fundação: " + dataFundacao.getDia() + "/" + dataFundacao.getMes() + "/" + dataFundacao.getAno() + "\n\n" +
                "*** Produtos inseridos *** \n " +
                Arrays.toString(estoqueProdutos);
    }
}
