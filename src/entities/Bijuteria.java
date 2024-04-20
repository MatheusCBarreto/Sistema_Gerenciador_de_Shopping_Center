package entities;

public class Bijuteria extends Loja {

    private double metasVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metasVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metasVendas = metasVendas;
    }

    public double getMetasVendas() {
        return metasVendas;
    }

    public void setMetasVendas(double metasVendas) {
        this.metasVendas = metasVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria{" +
                "metasVendas=" + metasVendas +
                "} " + super.toString();
    }
}
