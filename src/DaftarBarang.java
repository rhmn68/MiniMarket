import java.util.HashMap;

/**
 * Created by Rahman on 4/11/2017.
 */
public class DaftarBarang {
    int id;
    public Barang barang;
    private int qty;

    public HashMap<Integer,Barang> dbDaftarBarang = new HashMap<>();

    public void addDaftarBarang(Barang barang){
        dbDaftarBarang.put(barang.id,barang);
    }


    public void print(){
        System.out.println("ID_Daftar Barang : "+id);
        System.out.println("ID Barang : "+barang.id);
        System.out.println("Nama Barang : "+barang.nama);
        System.out.println("QTY : "+qty);
    }

    public static void main(String[] args){
        BarangPajang barangPajang = new BarangPajang();
        barangPajang.addBarang();
    }

}
