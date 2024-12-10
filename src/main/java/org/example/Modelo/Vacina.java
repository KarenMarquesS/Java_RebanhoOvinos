package org.example.Modelo;

import java.util.Date;

public class Vacina extends EntidadeBase{

    private int id_cordeiro;
    private int n_brinco;
    private Date data_vacina;
    private String nome_vacina;

    public Vacina() {
    }

    public Vacina(int id_cordeiro) {
        super(id_cordeiro);
    }

    public Vacina(int id_cordeiro, int n_brinco, Date data_vacina, String nome_vacina) {
        this.id_cordeiro = id_cordeiro;
        this.n_brinco = n_brinco;
        this.data_vacina = data_vacina;
        this.nome_vacina = nome_vacina;
    }

    public Vacina(int id_cordeiro, int id_cordeiro1, int n_brinco, Date data_vacina, String nome_vacina) {
        super(id_cordeiro);
        this.id_cordeiro = id_cordeiro1;
        this.n_brinco = n_brinco;
        this.data_vacina = data_vacina;
        this.nome_vacina = nome_vacina;
    }

    public Vacina(int n_brinco, Date data_vacina, String nome_vacina) {
        this.n_brinco = n_brinco;
        this.data_vacina = data_vacina;
        this.nome_vacina = nome_vacina;
    }

    @Override
    public int getId_cordeiro() {
        return id_cordeiro;
    }

    @Override
    public void setId_cordeiro(int id_cordeiro) {
        this.id_cordeiro = id_cordeiro;
    }

    public int getN_brinco() {
        return n_brinco;
    }

    public void setN_brinco(int n_brinco) {
        this.n_brinco = n_brinco;
    }

    public Date getData_vacina() {
        return data_vacina;
    }

    public void setData_vacina(Date data_vacina) {
        this.data_vacina = data_vacina;
    }

    public String getNome_vacina() {
        return nome_vacina;
    }

    public void setNome_vacina(String nome_vacina) {
        this.nome_vacina = nome_vacina;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "id_cordeiro=" + id_cordeiro +
                ", n_brinco=" + n_brinco +
                ", data_vacina=" + data_vacina +
                ", nome_vacina='" + nome_vacina + '\'' +
                ", id_cordeiro=" + id_cordeiro +
                '}';
    }
}
