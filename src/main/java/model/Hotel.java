package model;

public class Hotel {

    String nome;
    Integer classificacao;
    TaxaDiaDeSemana taxaDiaDeSemana;
    TaxaFimDeSemana taxaFimDeSemana;

    public Hotel(String nome, Integer classificacao, TaxaDiaDeSemana taxaDiaDeSemana,
        TaxaFimDeSemana taxaFimDeSemana) {

        this.nome = nome;
        this.classificacao = classificacao;
        this.taxaDiaDeSemana = taxaDiaDeSemana;
        this.taxaFimDeSemana = taxaFimDeSemana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public TaxaDiaDeSemana getTaxaDiaDeSemana() {
        return taxaDiaDeSemana;
    }

    public void setTaxaDiaDeSemana(TaxaDiaDeSemana taxaDiaDeSemana) {
        this.taxaDiaDeSemana = taxaDiaDeSemana;
    }

    public TaxaFimDeSemana getTaxaFimDeSemana() {
        return taxaFimDeSemana;
    }

    public void setTaxaFimDeSemana(TaxaFimDeSemana taxaFimDeSemana) {
        this.taxaFimDeSemana = taxaFimDeSemana;
    }
}
