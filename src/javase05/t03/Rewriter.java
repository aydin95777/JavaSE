package javase05.t03;

import java.io.*;

public class Rewriter {
    private String input;
    private String output;

    public Rewriter(final String input, final String output) {
        this.input = input;
        this.output = output;
    }

    public void rewrite() throws IOException {
        File file = new File(input);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF8"));
        String tmpstr;
        StringBuffer stringBuffer = new StringBuffer();
        while ((tmpstr = in.readLine()) != null) {
            stringBuffer.append(tmpstr);
        }
        write(stringBuffer.toString());
    }

    private void write(final String txt) throws IOException {
        File file = new File(output);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(txt.getBytes("UTF-16"));
    }
}
