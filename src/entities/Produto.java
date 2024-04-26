package entities;

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

        if (data.getAno() > dataValidade.getAno()) {
            return false;
        } else if ((data.getMes() > dataValidade.getMes()) && (data.getAno() > dataValidade.getAno())) {
            return false;
        } else if ((data.getMes() > dataValidade.getMes()) && (data.getAno() > dataValidade.getAno())
                && (data.getDia() > dataValidade.getDia())) {
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
