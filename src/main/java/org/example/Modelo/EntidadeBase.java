package org.example.Modelo;

public class EntidadeBase {

    protected int id_cordeiro;

    public EntidadeBase() {
    }

    public EntidadeBase(int id_cordeiro) {
        this.id_cordeiro = id_cordeiro;
    }

    public int getId_cordeiro() {
        return id_cordeiro;
    }

    public void setId_cordeiro(int id_cordeiro) {
        this.id_cordeiro = id_cordeiro;
    }

    @Override
    public String toString() {
        return "EntidadeBase{" +
                "id_cordeiro=" + id_cordeiro +
                '}';
    }
}
