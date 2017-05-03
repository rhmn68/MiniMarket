import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 5/2/2017.
 */
public class Report {
    int id;
    Transaksi transaksi;
    Pegawai pegawai;
    ArrayList<Pegawai> dbPegawai = new ArrayList<>();
    HashMap<Integer,Transaksi> dbTransaksi = new HashMap<>();

    public void addTransaksi(int idTransaksi,Transaksi transaksi){
        dbTransaksi.put(idTransaksi,transaksi);
    }

    public double hitungBulanan_T(){
        double total=0;
        for (Transaksi transaksi:dbTransaksi.values()){
            total = total+transaksi.hitungTagihan();
        }
        return total;
    }

    public void printTransasksi(){
        int i=0;
        System.out.println("======================BULAN MEI 2017=====================");
        System.out.println("     No Transaksi              Total Harga  ");
        System.out.println("==========================================================");
        for (Transaksi transaksi:dbTransaksi.values()){
            i++;
            System.out.printf("%10d",i);
            System.out.printf("%30.2f \n",transaksi.hitungTagihan());
        }
        System.out.println("==========================================================");
        System.out.println("Total Transaksi perbulan : "+hitungBulanan_T());
        System.out.println("==========================================================");
    }

    //PEGAWAI
    public void addPegawai(Pegawai pegawai){
        dbPegawai.add(pegawai);
    }
    public void isiPegawai(){
        Kasir rahman = new Kasir(1,"Rahman","Cimahi",50,0.10);addPegawai(rahman);
        Kasir rahmanda = new Kasir(2,"Rahmanda","Kopo",50,0.10);addPegawai(rahmanda);
        Kasir zakki = new Kasir(3,"Zakki","Bubat Berjaya",50,0.10);addPegawai(zakki);
        Manager benrigo = new Manager(1,"Benrigo","Bandung",200,0.20);addPegawai(benrigo);
    }
    public Pegawai cariPegawai(int idPegawai){return dbPegawai.get(idPegawai);}

    public double hitungBulanan_P(){
        double total = 0;
        for (Pegawai pegawai:dbPegawai){
            total = total + pegawai.hitungGaji();
        }
        return total;
    }

    public void printPegawai(){
        System.out.println("======================BULAN MEI 2017=====================");
        System.out.println("     Nama              Gaji                Pegawai");
        System.out.println("==========================================================");
        for (Pegawai pegawai:dbPegawai){
            System.out.printf("$%10s",pegawai.nama);
            System.out.printf("%16d",pegawai.gaji);
            System.out.printf("%21.2f\n",pegawai.tunjangan);
        }
        System.out.println("==========================================================");
        System.out.println("Total Gaji Pegawai :    "+hitungBulanan_P());
        System.out.println("==========================================================");
    }

    public static void main(String[] args){
        Report report = new Report();
        //tambah pegawai
       report.isiPegawai();
        //laporan bulanan Pegawai
        report.printPegawai();
        //tambah transaksi
        BarangPajang barangPajang = new BarangPajang();
        //Memanggil isi Barang
        barangPajang.isiBarang();
        //Inisialisasi
        Transaksi t1 = new Transaksi();
        //Menambahkan customer
        RegCustomer rahman = new RegCustomer(1,"Rahman","Cimahi", false);t1.setCustomer(rahman);
        //Menambahkan barang di cart
        Cart cart1 = new Cart(1,2,barangPajang.cariBarang(1));t1.addCart(cart1);
        Cart cart2 = new Cart(2,3,barangPajang.cariBarang(3));t1.addCart(cart2);
        //Print
        report.addTransaksi(1,t1);
        Transaksi t2 = new Transaksi();
        //Menambahkan customer
        RegCustomer zakkki = new RegCustomer(1,"Zakki","Bubat Berjaya", false);t2.setCustomer(rahman);
        //Menambahkan barang di cart
        Cart c1 = new Cart(1,1,barangPajang.cariBarang(1));t2.addCart(c1);
        Cart c2 = new Cart(2,1,barangPajang.cariBarang(3));t2.addCart(c2);
        //Print
        report.addTransaksi(2,t2);
        System.out.printf("\n\n\n");
        report.printTransasksi();
    }
}
