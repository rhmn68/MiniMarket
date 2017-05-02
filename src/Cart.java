import java.awt.*;
import java.util.ArrayList;

/**
 * Created by muhammad rahmanda on 02-May-17.
 */
public class Cart {
    int id;
    private ArrayList<Customer> arrCustomer = new ArrayList<>();
    private ArrayList<Barang> arrBarang = new ArrayList<>();
    int quantity;
    BarangPajang barangDiJual;
    /*
        constructor
     */

    public Cart(int id, int quantity, BarangPajang b) {
        this.id = id;
        this.quantity = quantity;
        barangDiJual = b;
    }



    public void addCart(int itemId) {
        Barang brg = barangDiJual.cariBarang(itemId);
        if (brg != null) {
            arrBarang.add(brg);
        }
    }

    /*
        print isi pesanan
    */
    public void print() {
        System.out.println("No. Pembelian "+id);
        for (Barang brg: arrBarang) {
            brg.print();
            System.out.println("Jumlah Barang : "+quantity);
            System.out.println("Jumlah tagihan:"+hitungHarga());
        }
    }

    /*
        hitung tagihan (berapa yg harus dibayar pelanggan).
        dihitung dengan menjumlahkan hargaJual item yang dipesanm
     */
    //LEGNGKAPI
    public long hitungHarga() {
        long total=0;
        for (Barang brg: arrBarang) {
            total = quantity * brg.hargaJual;
        }

        return total;
    }

    public long hitungTagihan() {
        long total=0;
        long jumlahHarga;
        for (Barang brg: arrBarang) {
            jumlahHarga = quantity * brg.hargaJual;
            total=total + jumlahHarga;
        }

        return total;
    }

    /*
        hitung biayar produksi.
        dihitung dengan menjumlahkan hargaProduksi item yang dipesanm
        nanti digunakan untuk menghitung keuntungan
     */
    //LENGKAPI
    public int hitungBiayaProduksi() {
        int total=0;
        //LENGKAPI
        return total;
    }

    /*
         jika method main() ini dijalankan maka hasilnya:

            **** test class Pesanan ****
            ===> Testing print pesanan:
            Meja:1
            Id:2
            Nama:Soto ayam
            Harga produksi:3
            Harga jual:7
            Id:3
            Nama:Air mineral
            Harga produksi:2
            Harga jual:4
            ===> Testing hitung tagihan:
            Jumlah tagihan:11
            ===> Testing hitung biaya produksi (modal):
            Jumlah biaya produksi:5

     */
    //method ini JANGAN DIEDIT
    public static void main(String[] args) {
       /* //JANGAN DIEDIT
        //testing
        System.out.println("**** test class Pesanan **** ");
        Menu m = new Menu();
        m.isiMenu();

        System.out.println("===> Testing print pesanan:");
        Pesanan p = new Pesanan(1,m);
        p.addItemPesan(2);   //pesan dua macam item
        p.addItemPesan(3);

        p.print(); //print pesanan pelanggan

        System.out.println("===> Testing hitung tagihan:");
        int jumTagihan = p.hitungTagihan();
        System.out.println("Jumlah tagihan:"+jumTagihan);

        System.out.println("===> Testing hitung biaya produksi (modal):");
        int jumBiayaProduksi = p.hitungBiayaProduksi();
        System.out.println("Jumlah biaya produksi:"+jumBiayaProduksi);*/
    }
}
