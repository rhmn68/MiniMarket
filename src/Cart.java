import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by muhammad rahmanda on 02-May-17.
 */
public class Cart {
    int id;
    int qty;
    Barang barang;

    public Cart(int id, int qty, Barang barang) {
        this.id = id;
        this.qty = qty;
        this.barang = barang;
    }

    public void print(){
        System.out.println("Nama Barang : "+barang.nama);
        System.out.println("Harga Barang : "+barang.hargaJual);
        System.out.println("Jumlah Barang : "+qty);
    }

    public double hitung(){
        double total=0;
        total = qty * barang.hargaJual;
        return total;
    }

    public static void main(String[] args) {
        BarangPajang barangPajang = new BarangPajang();
        barangPajang.isiBarang();
        Cart cart = new Cart(1,2,barangPajang.cariBarang(3));
        cart.print();
    }
}
