package javase05.t03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Rewriter rewriter = new Rewriter("resources\\javase05\\t03\\test.txt", "outfile.txt");
        rewriter.rewrite();
    }
}