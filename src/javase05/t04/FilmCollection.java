package javase05.t04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilmCollection implements Serializable {
    private List<Film> collection = new ArrayList<>();

    public void addFilm(Film film) {
        collection.add(film);
    }

    public void serializeIt(File file) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(this);
    }

    public static FilmCollection deserializeIt(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        return (FilmCollection) objectInputStream.readObject();
    }

    public void print() {
        for (Film film : collection)
            film.print();
    }
}