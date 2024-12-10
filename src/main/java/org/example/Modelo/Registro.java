package org.example.Modelo;

import java.util.Date;

public class Registro extends EntidadeBase{

    private int id_cordeiro;
    private int mae_brinco;
    private Date data_nascimento;
    private String sexo;
    private double peso_nascimento;
    private String raca;

    public Registro() {
    }

    public Registro(int id_cordeiro) {
        super(id_cordeiro);
    }

    public Registro(int id_cordeiro, int mae_brinco, Date data_nascimento, String sexo, double peso_nascimento, String raca) {
        this.id_cordeiro = id_cordeiro;
        this.mae_brinco = mae_brinco;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.peso_nascimento = peso_nascimento;
        this.raca = raca;
    }

    public Registro(int id_cordeiro, int id_cordeiro1, int mae_brinco, Date data_nascimento, String sexo, double peso_nascimento, String raca) {
        super(id_cordeiro);
        this.id_cordeiro = id_cordeiro1;
        this.mae_brinco = mae_brinco;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.peso_nascimento = peso_nascimento;
        this.raca = raca;
    }

    public Registro(Date data_nascimento, String sexo, double peso_nascimento, String raca) {
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.peso_nascimento = peso_nascimento;
        this.raca = raca;
    }

    @Override
    public int getId_cordeiro() {
        return id_cordeiro;
    }

    @Override
    public void setId_cordeiro(int id_cordeiro) {
        this.id_cordeiro = id_cordeiro;
    }

    public int getMae_brinco() {
        return mae_brinco;
    }

    public void setMae_brinco(int mae_brinco) {
        this.mae_brinco = mae_brinco;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso_nascimento() {
        return peso_nascimento;
    }

    public void setPeso_nascimento(double peso_nascimento) {
        this.peso_nascimento = peso_nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "T_Registro{" +
                "id_cordeiro=" + id_cordeiro +
                ", mae_brinco=" + mae_brinco +
                ", data_nascimento=" + data_nascimento +
                ", sexo='" + sexo + '\'' +
                ", peso_nascimento=" + peso_nascimento +
                ", raca='" + raca + '\'' +
                ", id_cordeiro=" + id_cordeiro +
                '}';
    }
}
