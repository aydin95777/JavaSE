package javase02.t01;

public class Main {
    public static void main(String[] args) {
        Pen bluePen = new Pen("Blue", 30);
        Pen redPen = new Pen("Red", 35);
        Pen bluePen2 = new Pen("Blue", 30);

        System.out.println(bluePen.hashCode());
        System.out.println(bluePen.equals(bluePen2));
        System.out.println(bluePen.equals(redPen));
        System.out.println(redPen.toString());
    }
}
