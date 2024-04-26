/*
* AINDA FALTA FAZER O MÉTODO VALIDADOR DE DATAS, ADICIONÁ-LO AO CONSTRUTOR E DESENVOLVER O MÉTODO TOSTRING
* ASS: MATHEUS DE C BARRETO
* */


package entities;

public class Data {

    private int dia = 1;
    private int mes = 1;
    private int ano = 2000;

    public Data(int dia, int mes, int ano) {
        validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0) {
            if(this.ano / 100 == 0) {
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    };

    public String validarData(int dia, int mes, int ano) {

        String dataPadrao = "1/1/2000";

        if (verificaAnoBissexto()) {
            if (dia > 0 && dia <= 31) {
                return dia + "/" + mes + "/" + ano;
            } else if (mes == 2 && dia <= 29) {
                System.out.println("O ano informado é bissexto: " + dia + "/" + mes + "/" + ano);
            }
        } else if(mes <= 12) {
            return dia + "/" + mes + "/" + ano;
        } else if (ano > 0) {
            return dia + "/" + mes + "/" + ano;
        }

        return dataPadrao;
    };

    @Override
    public String toString() {
        return "Data: " +
                "" + dia +
                "/" + mes +
                "/" + ano;
    }
}
