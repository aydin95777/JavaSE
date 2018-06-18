package javase02.t04;

import javase02.t03.Item;
import javase02.t03.Pen;
import javase02.t03.Pencil;
import javase02.t03.RecruitmentKit;

import java.util.Arrays;

public class Main {
    private static void printItem(Item[] items) {
        for (Item item : items) {
            System.out.println(item.getName() + "\t" + item.getPrice());
        }
    }

    public static void main(String[] args) {
        RecruitmentKit recKit = new RecruitmentKit();
        Pen[] pens = recKit.getPens();
        Pencil[] pencils = recKit.getPencils();
        Item[] items = new Item[5];
        items[0] = pens[0];
        items[1] = pens[1];
        items[2] = pens[2];
        items[3] = pencils[0];
        items[4] = pencils[1];

        System.out.println("Sorted by name");
        Arrays.sort(items, new NameComparator());
        printItem(items);

        System.out.println();
        System.out.println("Sorted by price");
        Arrays.sort(items, new PriceComparator());
        printItem(items);
        System.out.println();

        System.out.println("Sorted by name & price");
        Arrays.sort(items, new PriceComparator().thenComparing(new NameComparator()));
        printItem(items);


    }
}
