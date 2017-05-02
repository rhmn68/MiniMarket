import java.util.HashMap;

/**
 * Created by Muhammad Rahmanda on 18-Apr-17.
 */
//INISIALISASI BARANG
public class Barang {
    HashMap<Integer,Barang> dbBarang = new HashMap<>();
    private HashMap<Integer,Barang> ArrBarang = new HashMap<>();

    public void addBarang(Barang barang){dbBarang.put(barang.id,barang);} //Menambahkan barang

    int id;
    String nama;
    public long hargaJual;
    public long hargaProduksi;
    public int stok;

    public Barang(int id, String nama, long hargaJual, long hargaProduksi,int stok){
        this.id = id;
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
        this.stok = stok;
    }



    public void print(){
        for (Barang brg:ArrBarang.values()) {
            System.out.println("Id          : " + id);
            System.out.println("Nama Barang : " + nama);
            System.out.println("Harga Modal : " + hargaProduksi);
            System.out.println("Harga Jual  : " + hargaJual);
            System.out.println("Jumlah Stok : " + stok);
        }
    }

    public static void main(String args[]){
        Barang brg;
        brg = new Barang(1,"Tisu", 3000, 2750, 100);
        brg.print();
    }
}
