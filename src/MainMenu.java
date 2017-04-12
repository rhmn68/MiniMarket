/**
 * Created by Rahman on 4/12/2017.
 */
public class MainMenu {

    public static void main(String[] args){
        DaftarCustomer daftarCustomer = new DaftarCustomer();
        daftarCustomer.isiCustomer();
        Customer customer = daftarCustomer.cariCustomer(1);
        customer.print();
        BarangPajang  barangPajang = new BarangPajang();
        barangPajang.addBarang();
        Transaksi transaksi = new Transaksi(1,2,barangPajang.cari(1));
        transaksi.print();

    }
}
