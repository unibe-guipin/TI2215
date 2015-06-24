import javax.swing.*;

public class Validador{

    private int mtrz1v;
    private int mtrz2h;
    private int mtrz2v;
    private int mtrz1h;

    public Validador(int mtrz1h, int mtrz1v, int mtrz2h, int mtrz2v) {
        this.mtrz1h = mtrz1h;
        this.mtrz1v = mtrz1v;
        this.mtrz2h = mtrz2h;
        this.mtrz2v = mtrz2v;

        ValidaEntrada(mtrz1h, mtrz1v, mtrz2h, mtrz2v);
    }

    public static void ValidaEntrada(int mtrz1h, int mtrz1v, int mtrz2h, int mtrz2v) /*RETORNAR TRUE OR FALSE*/ {
        if (
                mtrz1h >=2 &&
                mtrz1h <= 6 &&
                mtrz1v >= 2 &&
                mtrz1v <= 6 &&
                mtrz2h >= 2 &&
                mtrz2h <= 6 &&
                mtrz2v >= 2 &&
                mtrz2v <= 6) {
            /*devolver true*/
        }
        /*devolver false*/
    }



}