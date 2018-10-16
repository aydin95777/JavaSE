package javase03.t01;

public class Main {
    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger();
        crazyLogger.addToLog("Hie");
        crazyLogger.addToLog("Start");
        crazyLogger.addToLog("Nice");
        crazyLogger.addToLog("Bye");

        crazyLogger.printLog();

        System.out.println(crazyLogger.searchByString("N"));
    }

}
