package javase01.t02;

public class Main {

    public static void main(String[] args) {
        double eps = 0.1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            double an = 1.0 / ((i + 1) * (i + 1));
            System.out.print("A" + i + " = " + an);
            if (an < eps) {
                System.out.print(" при n = " + i + " выполняется условие М");
            }
            System.out.println();
        }
    }
}


