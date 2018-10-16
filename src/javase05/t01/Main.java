package javase05.t01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteReader byteReader = new ByteReader("resources\\javase05\\t02\\test.java");
        byteReader.getResult("outfile.txt");
    }
}
