/**
 * Created by guillermo.pinales on 7/1/2015.
 */
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        /*
        int rows1 = 0;
        int columns1 =0;
        int rows2 = 0;
        int columns2 = 0;
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca las filas de la Primera Matriz: ");
        int rows1 = scanner.nextInt();
        System.out.print("Introduzca las columnas de la Primera Matriz: ");
        int columns1 = scanner.nextInt();
        System.out.print("Introduzca las filas de la Segunda Matriz: ");
        int rows2 = scanner.nextInt();
        System.out.print("Introduzca las columnas de la Segunda Matriz: ");
        int columns2 = scanner.nextInt();
        System.out.println();
        System.out.println("Digite los valores de la Primera Matriz");
        int[][] a = readMatrix(rows1, columns1);
        System.out.println();
        System.out.println("Digite los valores de la Segunda Matriz");
        int[][] b = readMatrix(rows2, columns2);
        int[][] sum = add(a, b);
        int[][] product = multi(a, b);
        System.out.println();
        System.out.println("A + B =");
        printMatrix(sum);
        System.out.println();
        System.out.println("A * B =");
        printMatrix(product);
    }

    public static boolean validateEntry (int num) {
        if (num >= 2 && num <= 6) {
            return true;
        } else {
            return false;
        }
    }

    public static int[][] readMatrix(int rows, int columns) {
        int[][] result = new int[rows][columns];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = s.nextInt();
            }
        }
        return result;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] multi(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] result = new int[rows][columns];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                result[i][j] = a[i][j] * b[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}