package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.Collection;

/**
 * Created by lazar on 30.9.16..
 */
public class Avion {

    public static final String POLJE_OZNAKA = "oznaka";
    public static final String POLJE_RASPON_KRILA = "raspon_krila";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA, canBeNull = false)
    private String oznaka;

    @DatabaseField(columnName = POLJE_RASPON_KRILA, canBeNull = false)
    private double rasponKrila;

    @ForeignCollectionField(foreignFieldName = "avion")
    private ForeignCollection<Roba> roba;

    public Avion() {
    }

    public Avion(String oznaka, double rasponKrila) {
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

    public Collection<Roba> getRoba() {
        return roba;
    }

    public void setRoba(ForeignCollection<Roba> roba) {
        this.roba = roba;
    }

       public String toString() {
           return "Avion{" +
                "id=" + id +
                ", oznaka='" + oznaka + '\'' +
                ", rasponKrila=" + rasponKrila +
                '}';
    }
}
