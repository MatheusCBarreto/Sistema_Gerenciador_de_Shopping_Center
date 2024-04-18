/*
* AINDA FALTA FAZER O MÉTODO VALIDADOR DE DATAS, ADICIONÁ-LO AO CONSTRUTOR E DESENVOLVER O MÉTODO TOSTRING
* ASS: MATHEUS DE C BARRETO
* */


package entities;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano = 2000;

    public Data(Integer dia, Integer mes, Integer ano) {
        validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0) return true;

        else return false;
    }

    public String validarData(Integer dia, Integer mes, Integer ano) {

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
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
