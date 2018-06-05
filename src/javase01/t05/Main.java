package javase01.t05;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    matrixA[i][j] = 1;
                } else if (j == n - i - 1) {
                    matrixA[i][n - i - 1] = 1;
                }
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
