package org.example.Modelo;

public class Peso extends EntidadeBase{

    private int id_cordeiro;
    private int n_brinco;
    private double peso_15_dias;
    private double peso_20_dias;
    private double peso_30_dias;
    private double peso_40_dias;
    private double peso_50_dias;
    private double peso_60_dias;
    private double peso_90_dias;
    private transient Registro registro;

    public Peso() {
    }

    public Peso(int id_cordeiro) {
        super(id_cordeiro);
    }

    public Peso(int id_cordeiro, int n_brinco, double peso_15_dias, double peso_20_dias, double peso_30_dias, double peso_40_dias, double peso_50_dias, double peso_60_dias, double peso_90_dias, Registro registro) {
        this.id_cordeiro = id_cordeiro;
        this.n_brinco = n_brinco;
        this.peso_15_dias = peso_15_dias;
        this.peso_20_dias = peso_20_dias;
        this.peso_30_dias = peso_30_dias;
        this.peso_40_dias = peso_40_dias;
        this.peso_50_dias = peso_50_dias;
        this.peso_60_dias = peso_60_dias;
        this.peso_90_dias = peso_90_dias;
        this.registro = registro;
    }

    public Peso(int id_cordeiro, int id_cordeiro1, int n_brinco, double peso_15_dias, double peso_20_dias, double peso_30_dias, double peso_40_dias, double peso_50_dias, double peso_60_dias, double peso_90_dias, Registro registro) {
        super(id_cordeiro);
        this.id_cordeiro = id_cordeiro1;
        this.n_brinco = n_brinco;
        this.peso_15_dias = peso_15_dias;
        this.peso_20_dias = peso_20_dias;
        this.peso_30_dias = peso_30_dias;
        this.peso_40_dias = peso_40_dias;
        this.peso_50_dias = peso_50_dias;
        this.peso_60_dias = peso_60_dias;
        this.peso_90_dias = peso_90_dias;
        this.registro = registro;
    }

    public Peso(double peso_15_dias, double peso_20_dias, double peso_30_dias, double peso_40_dias, double peso_50_dias, double peso_60_dias, double peso_90_dias) {
        this.peso_15_dias = peso_15_dias;
        this.peso_20_dias = peso_20_dias;
        this.peso_30_dias = peso_30_dias;
        this.peso_40_dias = peso_40_dias;
        this.peso_50_dias = peso_50_dias;
        this.peso_60_dias = peso_60_dias;
        this.peso_90_dias = peso_90_dias;
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

    public double getPeso_15_dias() {
        return peso_15_dias;
    }

    public void setPeso_15_dias(double peso_15_dias) {
        this.peso_15_dias = peso_15_dias;
    }

    public double getPeso_20_dias() {
        return peso_20_dias;
    }

    public void setPeso_20_dias(double peso_20_dias) {
        this.peso_20_dias = peso_20_dias;
    }

    public double getPeso_30_dias() {
        return peso_30_dias;
    }

    public void setPeso_30_dias(double peso_30_dias) {
        this.peso_30_dias = peso_30_dias;
    }

    public double getPeso_40_dias() {
        return peso_40_dias;
    }

    public void setPeso_40_dias(double peso_40_dias) {
        this.peso_40_dias = peso_40_dias;
    }

    public double getPeso_50_dias() {
        return peso_50_dias;
    }

    public void setPeso_50_dias(double peso_50_dias) {
        this.peso_50_dias = peso_50_dias;
    }

    public double getPeso_60_dias() {
        return peso_60_dias;
    }

    public void setPeso_60_dias(double peso_60_dias) {
        this.peso_60_dias = peso_60_dias;
    }

    public double getPeso_90_dias() {
        return peso_90_dias;
    }

    public void setPeso_90_dias(double peso_90_dias) {
        this.peso_90_dias = peso_90_dias;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "T_Peso{" +
                "id_cordeiro=" + id_cordeiro +
                ", n_brinco=" + n_brinco +
                ", peso_15_dias=" + peso_15_dias +
                ", peso_20_dias=" + peso_20_dias +
                ", peso_30_dias=" + peso_30_dias +
                ", peso_40_dias=" + peso_40_dias +
                ", peso_50_dias=" + peso_50_dias +
                ", peso_60_dias=" + peso_60_dias +
                ", peso_90_dias=" + peso_90_dias +
                ", registro=" + registro +
                ", id_cordeiro=" + id_cordeiro +
                '}';
    }
}
