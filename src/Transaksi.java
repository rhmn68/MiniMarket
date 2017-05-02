import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 4/10/2017.
 */
//Transaksi
public class Transaksi {
    int id;
    Customer customer;
    Barang barang;
    int qty;
    ArrayList<Transaksi> dbTransaksi = new ArrayList<>();

    public Transaksi(int id, Customer customer, Barang barang, int qty) {
        this.id = id;
        this.customer = customer;
        this.barang = barang;
        this.qty = qty;
    }

    public void print(){
        System.out.print("Nama Barang: "+barang.nama);
        System.out.print("| QTY: "+qty);
        System.out.println("| Harga Barang: "+barang.hargaJual);
    }

    public long hitungHargaJual(){
        long total=0;
        total = total + barang.hargaJual * qty;
        return total;
    }

    public static void main(String[] args){
        Customer rahman = new Customer(1,"Aulia Rahman","Cimohay");
        BarangPajang daftarBarang = new BarangPajang();
        daftarBarang.isi();
        Transaksi transaksi = new Transaksi(1,rahman,daftarBarang.cariBarang(1),3);
        transaksi.print();
        System.out.println(transaksi.hitungHargaJual());
    }
}
