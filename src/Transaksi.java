import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 4/10/2017.
 */
public class Transaksi {
    int id;
    private ArrayList<Barang> dbBarang = new ArrayList<>();
    BarangPajang brgPajang;

    public Transaksi(int id, BarangPajang brgPajang){
        this.id = id;
        this.brgPajang = brgPajang;
    }

    public void addTransaksi(int idBrg){
        Barang brg = brgPajang.cari(idBrg);
        if (brg!=null){
            dbBarang.add(brg);
        }
    }

    public void print(){
        System.out.println("Id_Transaksi : "+id);
        for (Barang brg:dbBarang){
            brg.print();
        }
    }

    public static void main(String[] args){
        BarangPajang brgPajang = new BarangPajang();
        brgPajang.addBarang();

        Transaksi T = new Transaksi(1,brgPajang);
        T.addTransaksi(1);
        T.addTransaksi(2);
        T.print();
    }
}
