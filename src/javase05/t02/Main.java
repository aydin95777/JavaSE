package javase05.t02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharReader charReader = new CharReader("resources\\javase05\\t02\\test.java");
        charReader.getResult("outfile2.txt");
    }
}
