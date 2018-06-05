package javase01.t06;

import java.util.NoSuchElementException;

public class Notebook {

    private Note[] noteArray;

    public Notebook() {
        this.noteArray = new Note[10];
    }

    /**
     * Увеличивает размер массива noteArray на 1
     */
    private void enlargeArray() {
        Note[] newNoteArray = new Note[noteArray.length + 1];
        System.arraycopy(noteArray, 0, newNoteArray, 0, noteArray.length);
//        for (int i = 0; i < noteArray.length; i++) {
//            newNoteArray[i] = noteArray[i];
//        }
        noteArray = newNoteArray;
    }

    /**
     * Добавляет запись в блокнот
     *
     * @param newNote запись, которую добавляем
     */
    public void addNote(Note newNote) {
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] == null) {
                noteArray[i] = newNote;
                break;
            }
            if (noteArray[noteArray.length - 1] != null) {
                enlargeArray();
                noteArray[noteArray.length - 1] = newNote;
            }
        }
    }

    /**
     * Ищет запись в блокноте
     *
     * @param searchNote запись, которую ищем
     * @return номер элемент массива noteArray
     */
    private int getIndexOfNote(Note searchNote) {
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] != null && noteArray[i].equals(searchNote)) {
                return i;
            }
        }
        throw (new NoSuchElementException(searchNote.getNote() + " not found in Notebook."));
    }

    /**
     * Удаляет запись из блокнота
     *
     * @param delNote запись, которую удаляем
     */
    public void deleteNote(Note delNote) {
        noteArray[getIndexOfNote(delNote)] = null;
    }

    /**
     * Редактирует запись
     *
     * @param oldEditNote старая запись
     * @param newEditNote новая запись
     */
    public void editNote(Note oldEditNote, Note newEditNote) {
        noteArray[getIndexOfNote(oldEditNote)] = newEditNote;

    }

    /**
     * Показывает все записи
     */
    public void showAllNotes() {
        for (Note note : noteArray) {
            if (note != null) {
                System.out.println(note.getNote());
            }
        }
        System.out.println();
    }
}
