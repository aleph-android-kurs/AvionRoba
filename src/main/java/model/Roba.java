package model;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by lazar on 30.9.16..
 */
public class Roba {

    private static final String POLJE_NAZIV = "naziv";
    private static final String POLJE_OPIS = "opis";
    private static final String POLJE_TEZINA = "tezina";
    private static final String POLJE_VISINA = "visina";
    private static final String POLJE_DUZINA = "duzina";
    private static final String POLJE_SIRINA = "sirina";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NAZIV, canBeNull = false)
    private String naziv;

    @DatabaseField(columnName = POLJE_OPIS, canBeNull = false)
    private String opis;

    @DatabaseField(columnName = POLJE_TEZINA, canBeNull = false)
    private double tezina;

    @DatabaseField(columnName = POLJE_VISINA, canBeNull = false)
    private double visina;

    @DatabaseField(columnName = POLJE_DUZINA, canBeNull = false)
    private double duzina;

    @DatabaseField(columnName = POLJE_SIRINA, canBeNull = false)
    private double sirina;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = true)
    private Avion avion;

    //Konstrutkor bez parametara
    public Roba() {
        //Obavezan za potrebe ORMLite-a
    }

    public Roba(String naziv, String opis, double tezina, double visina, double duzina, double sirina) {
        this.naziv = naziv;
        this.opis = opis;
        this.tezina = tezina;
        this.visina = visina;
        this.duzina = duzina;
        this.sirina = sirina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
