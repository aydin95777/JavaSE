package javase01.t06;

import java.util.Objects;

public class Note {
    private String note;

    public Note(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        return Objects.equals(note, note1.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(note);
    }
}
