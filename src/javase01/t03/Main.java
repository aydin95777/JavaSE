package javase01.t03;

import static java.lang.Math.tan;

public class Main {

    private static double fx(double x) {
        return (tan(2 * x) - 3);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int h = 1;
        for (int i = a; i <= b; i += h) {
            System.out.println(i + "\t" + fx((double) i));
        }
    }
}
