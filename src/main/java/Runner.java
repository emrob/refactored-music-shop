import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {


        Guitar guitar = new Guitar("Fender","Red",10,100,150);
        DBHelper.saveOrUpdate(guitar);

        Piano piano = new Piano("Yamaha", "Black", 900, 1200);
        DBHelper.saveOrUpdate(piano);

        MusicBook musicBook = new MusicBook("Scales", 2, 5);
        DBHelper.saveOrUpdate(musicBook);

        MusicStand musicStand = new MusicStand("Blue", 5, 10);
        DBHelper.saveOrUpdate(musicStand);

        List<Instrument> instruments = DBHelper.getAll(Instrument.class);
    }
}

