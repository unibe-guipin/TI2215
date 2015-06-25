import javax.swing.*;

public class Validador{

    private int mth1;
    private int mtv1;
    private int mth2;
    private int mtv2;

    public static boolean Entrada(int numero) {
        if (numero >=2 && numero <= 6){
            return true;
        } else {
            return false;
        }
    }

    public boolean Cuadradas(int mtrzh, int mtrzv) {
        if (mtrzh == mtrzv) {
            return true;
        } else {
            return false;
        }
    }

    public  boolean Orden (int mh1, int mh2, int mv1, int mv2){
        this.mth1 = mh1;
        this.mtv1 = mv1;
        this.mth2 = mh2;
        this.mtv2 = mv2;

        if (mh1 == mh2 && mv1 == mv2){
            return true;
        } else {
            return false;
        }
    }

}