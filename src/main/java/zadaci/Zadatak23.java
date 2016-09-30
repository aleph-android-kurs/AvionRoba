package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.field.types.IntegerObjectType;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import model.Avion;
import model.Roba;

import java.io.IOException;

/**
 * Created by lazar on 30.9.16..
 */
public class Zadatak23 {

    static Dao<Avion, Integer> avionDao;
    static Dao<Roba, Integer> robaDao;

    public static void main(String[] args){
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");

            avionDao = DaoManager.createDao(connectionSource, Avion.class);
            robaDao = DaoManager.createDao(connectionSource, Roba.class);

            Avion a1 = new Avion("Avion1", 34);
            Avion a2 = new Avion("Avion2", 21);

            avionDao.create(a1);
            avionDao.create(a2);

            Roba r1 = new Roba("Patike", "Duboke patike", 1, 0.1, 0.4, 0.05);
            r1.setAvion(a1);
            Roba r2 = new Roba("Kosulja", "Na duge rukave", 0.4, 0.01, 2.4, 0.5);
            r2.setAvion(a1);
            Roba r3 = new Roba("Voda", "Voda za pice", 1, 0.1, 0.4, 0.05);
            r3.setAvion(a1);
            Roba r4 = new Roba("Ploce", "Drvene ploce", 3.4, 0.1, 3, 2.3);
            r4.setAvion(a2);
            Roba r5 = new Roba("Stolica", "Plasticna stolica", 2.4, 1.2, 0.8, 0.5);
            r5.setAvion(a2);

            robaDao.create(r1);
            robaDao.create(r2);
            robaDao.create(r3);
            robaDao.create(r4);
            robaDao.create(r5);



        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connectionSource != null) {
                try {
                    connectionSource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
