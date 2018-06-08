package javase02.t02;

class Pencil extends Item{
    private String hardness;

    Pencil(String hardness, int price) {
        this.hardness = hardness;
        this.price = price;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }
}
