import java.util.ArrayList;

/**
 * Created by Rahman on 4/10/2017.
 */
public class Transaksi {
    int id;
    int qty;
    Barang barang;

    public Transaksi(int id, int qty, Barang barang) {
        this.id = id;
        this.qty = qty;
        this.barang = barang;
    }

    public void print(){
        System.out.println("Id_Transaksi : "+id);
        System.out.println("QTY : "+qty);
        System.out.println("Nama Barang : "+barang.nama);
        System.out.println("Harga : "+barang.hargaJual);
    }

    public int hitungBarang(){
        int total=0;
        return total;
    }

    public static void main(String[] args){
        DaftarCustomer daftarCustomer = new DaftarCustomer();
        daftarCustomer.isiCustomer();
        BarangPajang barangPajang = new BarangPajang();
        barangPajang.addBarang();
        Transaksi transaksi = new Transaksi(1,20,barangPajang.cari(1));
    }
}
