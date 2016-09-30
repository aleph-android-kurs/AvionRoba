package model;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by lazar on 30.9.16..
 */
public class Avion {

    private static final String POLJE_OZNAKA = "oznaka";
    private static final String POLJE_RASPON_KRILA = "raspon_krila";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA, canBeNull = false)
    private String oznaka;

    @DatabaseField(columnName = POLJE_RASPON_KRILA, canBeNull = false)
    private double rasponKrila;

    public Avion() {
    }

    public Avion(int id, String oznaka, double rasponKrila) {
        this.id = id;
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }
}
