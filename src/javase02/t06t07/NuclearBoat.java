package javase02.t06t07;

@MyAnnotation(
        author =  "Aydyn Aliev",
        date = "10.07.2018"
)
public class NuclearBoat {
    private String name;
    private boolean statement;

    public NuclearBoat(String name) {
        this.name = name;
    }

    public class Engine {
        public void run() {
            System.out.println(name + " is running!");
        }
    }


}
