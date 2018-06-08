package javase02.t03;

public class RecruitmentKit {
    private Pen[] pens;
    private Pencil[] pencils;


    RecruitmentKit() {
        this.pens = new Pen[]{
                new Pen("BluePen", "blue", 30),
                new Pen("RedPen", "red", 35),
                new Pen("BLackPen", "black", 40)
        };
        this.pencils = new Pencil[]{
                new Pencil("BlackPen", "black", 30),
                new Pencil("Pencil2T", "2T", 20)
        };
    }

    public void printItems() {
        for (Pen pen : pens) {
            System.out.println("pens: " + pen.getName());
        }
        for (Pencil pencils : pencils) {
            System.out.println("pencils: " + pencils.getName());
        }
    }
}
