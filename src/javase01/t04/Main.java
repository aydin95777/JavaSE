package javase01.t04;

public class Main {

    private static int[] generateRandomArray(int n) {
        int[] array = new int[2 * n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
        }
        return array;
    }

    private static int generateMaxValue(int[] array) {
        int maxValue = array[0] + array[array.length - 1];
        for (int i = 0; i < array.length / 2; i++) {
            int def = array[i] + array[array.length - 1 - i];
            if (def > maxValue) {
                maxValue = def;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] array = generateRandomArray(n);
        System.out.print("Array: ");

        for (int anArray : array) {
            System.out.print(anArray + "  ");
        }
        System.out.println();
        System.out.println("Max Value: " + generateMaxValue(array));
    }
}
