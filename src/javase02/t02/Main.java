package javase02.t02;

public class Main {
    public static void main(String[] args) {
        Pen bluePen = new Pen("blue", 30);
        Pen redPen = new Pen("red", 35);
        Pen blackPen = new Pen("black", 30);
        Pen[] penArray = new Pen[]{bluePen, redPen, blackPen};

        Pencil pencilM = new Pencil("M", 20);
        Pencil pencil2T = new Pencil("2T", 20);
        Pencil[] pencilArray = new Pencil[]{pencilM, pencil2T};

        Workman alex = new Workman("Alex");
        alex.setItems(penArray, pencilArray);
        System.out.println("Summary price: " + alex.SummaryPrice() );
    }
}
