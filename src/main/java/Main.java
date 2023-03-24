import java.util.Random;

public class Main {

    public static int SIZE = 8;

    public static void printScreen(int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);

            }
        }

        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][i - 1] = colors[SIZE - i][j];
            }
        }

        printScreen(colors);
        System.out.println("Вывод: ");
        printScreen(rotatedColors);
    }
}
