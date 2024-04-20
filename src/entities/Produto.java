package entities;

import java.time.LocalDate;

public class Produto {

    private String nome;
    private int preco;
    private Data dataValidade;

    public Produto(String nome, int preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data) {

        LocalDate hoje = LocalDate.now();

        if (data.getAno() > hoje.getYear()) {
            return false;
        } else if ((data.getMes() > hoje.getMonthValue()) && (data.getAno() > hoje.getYear())) {
            return false;
        } else if ((data.getMes() > hoje.getMonthValue()) && (data.getAno() > hoje.getYear())
                && (data.getDia() > hoje.getDayOfMonth())) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Informações de produto: " + "\n " +
                "-------------------------------" + "\n " +
                "Nome: " + nome + "\n " +
                "Preco: " + preco + "\n " +
                "DataValidade: " + dataValidade.getDia() + "/" + dataValidade.getMes() + "/" + dataValidade.getAno() + "\n\n";
    }
}
