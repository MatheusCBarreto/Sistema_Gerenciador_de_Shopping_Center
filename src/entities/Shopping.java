package entities;

import entities.*;

import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;

    Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        System.out.println("Não foi possível concluir esta operação.");
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        System.out.println("Não foi possível concluir esta operação.");
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int total = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getClass().getSimpleName().equalsIgnoreCase(tipoLoja)) {
                total++;
            }
        }
        return total;
    }

    public Informatica lojaSeguroMaisCaro() {

        Informatica maiorSeguro = null;

        for (int i = 0; i < lojas.length; i++) {
            Informatica loja = null;
            if (lojas[i] instanceof Informatica) {
                loja = (Informatica) lojas[i];
                if (maiorSeguro != null && loja.getSeguroEletronicos() > maiorSeguro.getSeguroEletronicos()) {
                    loja = maiorSeguro;
                }
            }
            return loja;
        }
        return null;
    }

    @Override
    public String toString() {
        return "======= Shopping =======" +
                "Nome: " + nome + "\n " +
                "Endereco: " + endereco + "\n " +
                "Lojas: " + Arrays.toString(lojas);
    }
}
