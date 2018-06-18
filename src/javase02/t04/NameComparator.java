package javase02.t04;

import javase02.t03.Item;

import java.util.Comparator;

public class NameComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
