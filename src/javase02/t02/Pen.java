package javase02.t02;

class Pen extends Item{
    private String color;

    Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
