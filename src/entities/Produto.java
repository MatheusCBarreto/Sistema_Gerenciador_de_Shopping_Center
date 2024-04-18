package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.SimpleFormatter;

public class Produto {

    private String nome;
    private Integer preco;
    private Data dataValidade;

    public Produto(String nome, Integer preco, Data dataValidade) {
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

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // fazer a validação
    public boolean estaVencido(Data data) {

        LocalDate hoje = LocalDate.now();

        if(data.getAno() > hoje.getYear()) {
            return false;
        } else if ((data.getMes() > hoje.getMonthValue()) && (data.getAno() > hoje.getYear())) {
            return false;
        } else if ((data.getMes() > hoje.getMonthValue()) && (data.getAno() > hoje.getYear()) && (data.getDia() > hoje.getDayOfMonth())) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome=' " + nome + '\'' +
                ", Preco= " + preco +
                '}';
    }
}
