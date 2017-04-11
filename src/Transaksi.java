import java.util.HashMap;

/**
 * Created by Rahman on 4/10/2017.
 */
public class Transaksi {
    int id;
    HashMap<Integer, Barang> ArrTransaksi = new HashMap<Integer, Barang>();
    BarangPajang brgPajang;

    public void addTransaksi(int idBrg){
        Barang brg = brgPajang.cari(idBrg);
        if (brg!=null){
            ArrTransaksi.put(brg.id,brg);
        }
    }
    public static void main(String[] args){

    }
}
