import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 4/12/2017.
 */
public class MainMenu {
    ArrayList<Customer> dbCustomer = new ArrayList<>();
    ArrayList<Transaksi> dbTransaksi = new ArrayList<>();

    public void addTransaksi(int id, Customer customer, Barang barang, int qty){
        Transaksi transaksi = new Transaksi(id,customer,barang,qty);
        dbTransaksi.add(transaksi);
    }

    public void print(){
        for (Transaksi transaksi:dbTransaksi){
            transaksi.print();
        }
    }

    public long hitungHargaJual(){
        long total=0;
        for (Transaksi transaksi:dbTransaksi){
            total = total + transaksi.hitungHargaJual();
        }
        return total;
    }

    public static void main(String[] args){
       BarangPajang daftarBarang = new BarangPajang();
       daftarBarang.isi();

       Customer aulia = new Customer(1,"Aulia Rahman","Cimahi");
       MainMenu mainMenu = new MainMenu();
       aulia.print();
       mainMenu.addTransaksi(1,aulia, daftarBarang.cariBarang(1),2);
       mainMenu.addTransaksi(1,aulia,daftarBarang.cariBarang(2),3);
       mainMenu.addTransaksi(1,aulia,daftarBarang.cariBarang(3),2);
       mainMenu.addTransaksi(1,aulia,daftarBarang.cariBarang(4),2);
       mainMenu.print();
       System.out.println("Total = "+mainMenu.hitungHargaJual());
    }
}
