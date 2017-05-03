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

        //print daftar barang
//        barangPajang.print();
        //menambah customer
        RegCustomer rahman = new RegCustomer(1,"Rahman","Cimohay",false);
        MemCustomer benrigo = new MemCustomer(1,"Benrigo","Bubat Bersatu",true);

        //Rahman Cart
        Transaksi t1 = new Transaksi();
        Cart c1 = new Cart(1,2,barangPajang.cariBarang(2));t1.addCart(c1);

        //cetak struk
        t1.struk();
    }
}
