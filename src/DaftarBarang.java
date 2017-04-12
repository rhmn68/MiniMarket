import java.util.HashMap;

/**
 * Created by Rahman on 4/11/2017.
 */

//Daftar Barang yang tersedia di Mini Market
public class DaftarBarang {
    HashMap<Integer,Barang> dbBarang = new HashMap<>();

    public void addBarang(Barang barang){dbBarang.put(barang.id,barang);} //Menambahkan barang
    public Barang cariBarang(int idBrg){return dbBarang.get(idBrg);}//Pencarian Data Barang

    //Isi barang ke dbBarang
    public void isi(){
        Barang barang;
        barang = new Barang(1,"Tisu",5000,4500);addBarang(barang);
        barang = new Barang(2,"Kawat",10000,9000);addBarang(barang);
        barang = new Barang(3,"Tembaga",6000,5000);addBarang(barang);
        barang = new Barang(4,"Solar",20000,15000);addBarang(barang);
    }

    public void print(){
        for (Barang barang:dbBarang.values()){
            System.out.println("ID_Barang : "+barang.id);
            System.out.println("Nama : "+barang.nama);
            System.out.println("Harga Jual : "+barang.hargaJual);
            System.out.println("Harga Produksi : "+barang.hargaProduksi);
        }
    }

    public static void main(String[] args){
        DaftarBarang daftarBarang = new DaftarBarang();
        daftarBarang.isi();
        daftarBarang.print();
    }
}
