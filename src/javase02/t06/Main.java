package javase02.t06;

public class Main {
    public static void main(String[] args) {
        NuclearBoat nuclearBoat = new NuclearBoat("myNuclearBoat");
        NuclearBoat.Engine engineForNuclearBoat = nuclearBoat.new Engine();
        engineForNuclearBoat.run();

    }
}
