package javase05.t04;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        File file = new File("resources\\javase05\\t04\\test.txt");

        FilmCollection filmCollection = new FilmCollection();
        Film film1 = new Film("Venom");
        film1.addActor(new Actor("Tom", "Hardy"));
        filmCollection.addFilm(film1);
        filmCollection.serializeIt(file);

        FilmCollection filmCollection1 = filmCollection.deserializeIt(file);

        filmCollection1.print();

    }


}
