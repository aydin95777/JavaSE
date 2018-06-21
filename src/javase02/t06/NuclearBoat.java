package javase02.t06;

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
