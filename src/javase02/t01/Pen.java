package javase02.t01;

import java.util.Objects;

public class Pen {
    private String color;
    private int price;


    Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, price);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
