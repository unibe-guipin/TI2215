/**
 * Created by guillermo.pinales on 7/1/2015.
 */
import java.sql.Array;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeros[];

        for(int i = 0; i < 4; i++){
            int numero = scanner.nextInt();
            if ((validateEntry(numero)) == true){
                numeros[i] = numero;
                i++;
            }else{
                System.out.print("Introduzca un numéro entre 2 y 6");
            }
        }

        int rows1 = numeros[0];
        int columns1 = numeros[1];
        int rows2 = numeros[2];
        int columns2 = numeros[3];


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