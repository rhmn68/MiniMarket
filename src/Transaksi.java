import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 4/10/2017.
 */
//Transaksi
public class Transaksi {
    int id;
    Kasir kasir;
    Barang barang;
    Customer customer;
    ArrayList<Cart> dbCart = new ArrayList<>();

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addCart(Cart cart){
        BarangPajang barangPajang = new BarangPajang();
        if (barangPajang!=null){
            dbCart.add(cart);
        }
    }

    public double hitungBarang(){
        double total = 0;
        for (Cart cart:dbCart){
            total = cart.qty * cart.barang.hargaJual;
        }
        return total;
    }

    public double hitungTotal(){
        double total = 0;
        for (Cart cart:dbCart){
            total = total + cart.hitung();
        }
        return total;
    }

    public double hitungTagihan(){
        double total = 1;
        double diskon = 1;
        if (getCustomer().diskon == true){
            diskon = hitungTotal() * 0.15;
            total = hitungTotal() - diskon;
        }else {
            total = hitungTotal();
        }
        return total;
    }

    public int hitungItem(){
        int jml;
        return jml=dbCart.size();
    }

    public void struk(){
        //Memanggil Isi Pegawai
        Report r = new Report();
        r.isiPegawai();
        //Menggunakan array dimulai dari 0
        Pegawai p = r.cariPegawai(0);

        //Cetak
        System.out.println("=============================");
        System.out.println("     Toko Guna Berjaya    ");
        System.out.println("Setiabudhi Bandung Jawa Barat");
        System.out.println("=============================");
        for (Cart cart:dbCart){
            System.out.print(cart.barang.nama);
            System.out.print("    "+cart.barang.hargaJual);
            System.out.println("    "+cart.qty);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Item      : "+hitungItem());
        if (getCustomer().diskon == true){
            System.out.println("Diskon          : 15%");
        }else {
            System.out.println("Diskon        : 0");
        }
        System.out.println("Total Harga     : "+hitungTagihan());
        System.out.println("-----------------------------");
        System.out.println("Kasir     :  "+p.nama);
        System.out.println("=============================");
    }

    public static void main(String[] args){
        //Inisialisasi
        Transaksi transaksi = new Transaksi();
        BarangPajang barangPajang = new BarangPajang();
        //Memanggil isi Barang
        barangPajang.isiBarang();
        //Menambahkan customer
        RegCustomer rahman = new RegCustomer(1,"Rahman","Cimahi", false);transaksi.setCustomer(rahman);
        //Menambahkan barang di cart
        Cart cart1 = new Cart(1,2,barangPajang.cariBarang(1));transaksi.addCart(cart1);
        Cart cart2 = new Cart(2,3,barangPajang.cariBarang(3));transaksi.addCart(cart2);
        //Print
        transaksi.struk();
    }
}
