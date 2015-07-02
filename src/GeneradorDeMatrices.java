import javax.swing.*;

/**
 * Created by mitramejia on 6/23/15.
 */
public class GeneradorDeMatrices {

    private int nrows;
    private int ncols;
    private int [][] data;

    public Matrix(int[][] dat) {

        this.data = dat;
        this.nrows = dat.length;
        this.ncols = dat[0].length;
    }

    public Matrix(int nrow, int ncol) {

        this.nrows = nrow;
        this.ncols = ncol;
        data = new int[nrow][ncol]; }
}