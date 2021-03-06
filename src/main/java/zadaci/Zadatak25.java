package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Avion;
import model.Roba;

import java.io.IOException;
import java.util.List;

/**
 * Created by lazar on 30.9.16..
 */
public class Zadatak25 {
    static Dao<Avion, Integer> avionDao;
    static Dao<Roba, Integer> robaDao;

    public static void main(String[] args){
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");

            avionDao = DaoManager.createDao(connectionSource, Avion.class);
            robaDao = DaoManager.createDao(connectionSource, Roba.class);

            List<Roba> roba = robaDao.queryForAll();

            for (Roba r : roba){
                System.out.println(r);
            }

            Roba izmena = robaDao.queryForEq(Roba.POLJE_NAZIV, "Voda").get(0);

            robaDao.delete(izmena);

            roba = robaDao.queryForAll();

            for (Roba r : roba){
                System.out.println(r);
            }




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
