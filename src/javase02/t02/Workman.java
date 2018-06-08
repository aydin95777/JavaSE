package javase02.t02;

import java.util.Arrays;

public class Workman {
    private String name;
    private Pen[] pens;
    private Pencil[] pencils;
    //Item[] pens = new Item[10];

    public void setItems(Pen[] items, Pencil[] pencils) {
        this.pens = items;
        this.pencils = pencils;
    }

    Workman(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Workman{" +
                "name='" + name + '\'' +
                ", pens=" + (pens == null ? null : Arrays.asList(pens)) +
                ", pencils=" + (pencils == null ? null : Arrays.asList(pencils)) +
                '}';
    }

    public int SummaryPrice() {
        int sumNumber = 0;
        for (Pen pen : pens) {
            sumNumber += pen.getPrice();
        }
        for (Pencil pencil : pencils) {
            sumNumber += pencil.getPrice();
        }
        //System.out.println("Summary price " + sumNumber);
        return sumNumber;
    }
}
