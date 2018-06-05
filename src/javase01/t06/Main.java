package javase01.t06;

public class Main {
    public static void main(String[] args) {
        Notebook myNotebook = new Notebook();
        myNotebook.addNote(new Note("Запись 0"));
        myNotebook.addNote(new Note("Запись 1"));
        myNotebook.addNote(new Note("Запись 2"));
        myNotebook.showAllNotes();
        myNotebook.deleteNote(new Note("Запись 1"));
        myNotebook.showAllNotes();
        myNotebook.editNote(new Note("Запись 0"), new Note("Новая запись"));
        myNotebook.showAllNotes();

       /*
       myNotebook.deleteNote(new Note("Запись"));
        myNotebook.showAllNotes();
        myNotebook.editNote(new Note("Запись"), new Note("Новая запись"));
        myNotebook.showAllNotes();
        */
zslkdjgfhpgsadpgfiuasuhi[dgf]
    }
}
