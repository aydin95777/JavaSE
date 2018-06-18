package javase02.t03;

public class RecruitmentKit {
    private Pen[] pens;
    private Pencil[] pencils;

    public RecruitmentKit() {
        this.pens = new Pen[]{
                new Pen("BluePen", "blue", 30),
                new Pen("RedPen", "red", 35),
                new Pen("BlackPen", "black", 40)
        };
        this.pencils = new Pencil[]{
                new Pencil("BlackPencil", "black", 30),
                new Pencil("Pencil2T", "2T", 20)
        };
    }

    public Pen[] getPens() {
        return pens.clone();
    }

   public Pencil[] getPencils() {
        return pencils.clone();
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
