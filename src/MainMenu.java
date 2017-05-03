import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 4/12/2017.
 */
public class MainMenu {
    public static void main(String[] args){
        //tambah barang
        BarangPajang barangPajang = new BarangPajang();
        barangPajang.isiBarang();
        //tambah pegawai
        //inisialisasi report
        Report report = new Report();
        report.isiPegawai();
//        report.printPegawai();
//        report.printTransasksi();
        //print daftar barang
//        barangPajang.print();

        //Rahman Cart
        Transaksi t1 = new Transaksi();
        //menambah customer
        RegCustomer rahman = new RegCustomer(1,"Rahman","Cimohay",false);t1.setCustomer(rahman);
        Cart Rah_c1 = new Cart(1,2,barangPajang.cariBarang(2));t1.addCart(Rah_c1);
        Cart Rah_c2 = new Cart(2,2,barangPajang.cariBarang(1));t1.addCart(Rah_c2);

        //cetak struk
//        t1.struk();

        Transaksi t2 = new Transaksi();
        //menambah customer
        MemCustomer benrigo = new MemCustomer(1,"Benrigo","Bubat Bersatu",true);t2.setCustomer(benrigo);
        Cart Ben_c1 = new Cart(1,2,barangPajang.cariBarang(2));t1.addCart(Ben_c1);
        Cart Ben_c2 = new Cart(2,2,barangPajang.cariBarang(1));t1.addCart(Ben_c2);

        //cetak struk
//        t2.struk();
    }
}
