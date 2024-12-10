package org.example.Modelo;

import java.util.Date;

public class Manejo extends EntidadeBase{

    private int id_cordeiro;
    private int n_brinco;
    private Date data_manejo;
    private int grau_famacha;
    private String vermifugo_oral;
    private String vermifugo_muscular;
    private String vermifugo_venoso;
    private String nome_vermifugo;
    private String presenca_bicheira;
    private String nome_medicamento;


    public Manejo() {
    }

    public Manejo(int id_cordeiro) {
        super(id_cordeiro);
    }

    public Manejo(int id_cordeiro, int n_brinco, Date data_manejo, int grau_famacha, String vermifugo_oral, String vermifugo_muscular, String vermifugo_venoso, String nome_vermifugo, String presenca_bicheira, String nome_medicamento) {
        this.id_cordeiro = id_cordeiro;
        this.n_brinco = n_brinco;
        this.data_manejo = data_manejo;
        this.grau_famacha = grau_famacha;
        this.vermifugo_oral = vermifugo_oral;
        this.vermifugo_muscular = vermifugo_muscular;
        this.vermifugo_venoso = vermifugo_venoso;
        this.nome_vermifugo = nome_vermifugo;
        this.presenca_bicheira = presenca_bicheira;
        this.nome_medicamento = nome_medicamento;
    }

    public Manejo(int id_cordeiro, int id_cordeiro1, int n_brinco, Date data_manejo, int grau_famacha,
                  String vermifugo_oral, String vermifugo_muscular, String vermifugo_venoso, String nome_vermifugo,
                  String presenca_bicheira, String nome_medicamento) {
        super(id_cordeiro);
        this.id_cordeiro = id_cordeiro1;
        this.n_brinco = n_brinco;
        this.data_manejo = data_manejo;
        this.grau_famacha = grau_famacha;
        this.vermifugo_oral = vermifugo_oral;
        this.vermifugo_muscular = vermifugo_muscular;
        this.vermifugo_venoso = vermifugo_venoso;
        this.nome_vermifugo = nome_vermifugo;
        this.presenca_bicheira = presenca_bicheira;
        this.nome_medicamento = nome_medicamento;
    }

    public Manejo(Date data_manejo, int grau_famacha, String vermifugo_oral, String vermifugo_muscular,
                  String vermifugo_venoso, String nome_vermifugo, String presenca_bicheira, String nome_medicamento) {
        this.data_manejo = data_manejo;
        this.grau_famacha = grau_famacha;
        this.vermifugo_oral = vermifugo_oral;
        this.vermifugo_muscular = vermifugo_muscular;
        this.vermifugo_venoso = vermifugo_venoso;
        this.nome_vermifugo = nome_vermifugo;
        this.presenca_bicheira = presenca_bicheira;
        this.nome_medicamento = nome_medicamento;
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

    public Date getData_manejo() {
        return data_manejo;
    }

    public void setData_manejo(Date data_manejo) {
        this.data_manejo = data_manejo;
    }

    public int getGrau_famacha() {
        return grau_famacha;
    }

    public void setGrau_famacha(int grau_famacha) {
        this.grau_famacha = grau_famacha;
    }

    public String getVermifugo_oral() {
        return vermifugo_oral;
    }

    public void setVermifugo_oral(String vermifugo_oral) {
        this.vermifugo_oral = vermifugo_oral;
    }

    public String getVermifugo_muscular() {
        return vermifugo_muscular;
    }

    public void setVermifugo_muscular(String vermifugo_muscular) {
        this.vermifugo_muscular = vermifugo_muscular;
    }

    public String getVermifugo_venoso() {
        return vermifugo_venoso;
    }

    public void setVermifugo_venoso(String vermifugo_venoso) {
        this.vermifugo_venoso = vermifugo_venoso;
    }

    public String getNome_vermifugo() {
        return nome_vermifugo;
    }

    public void setNome_vermifugo(String nome_vermifugo) {
        this.nome_vermifugo = nome_vermifugo;
    }

    public String getPresenca_bicheira() {
        return presenca_bicheira;
    }

    public void setPresenca_bicheira(String presenca_bicheira) {
        this.presenca_bicheira = presenca_bicheira;
    }

    public String getNome_medicamento() {
        return nome_medicamento;
    }

    public void setNome_medicamento(String nome_medicamento) {
        this.nome_medicamento = nome_medicamento;
    }

    @Override
    public String toString() {
        return "T_Manejo{" +
                "id_cordeiro=" + id_cordeiro +
                ", n_brinco=" + n_brinco +
                ", data_manejo=" + data_manejo +
                ", grau_famacha=" + grau_famacha +
                ", vermifugo_oral='" + vermifugo_oral + '\'' +
                ", vermifugo_muscular='" + vermifugo_muscular + '\'' +
                ", vermifugo_venoso='" + vermifugo_venoso + '\'' +
                ", nome_vermifugo='" + nome_vermifugo + '\'' +
                ", presenca_bicheira='" + presenca_bicheira + '\'' +
                ", nome_medicamento='" + nome_medicamento + '\'' +
                ", id_cordeiro=" + id_cordeiro +
                '}';
    }
}
