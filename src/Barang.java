/**
 * Created by Rahman on 4/5/2017.
 */
//INISIALISASI BARANG
public class Barang {
    int id;
    String nama;
    public int hargaJual;
    public int hargaProduksi;

    public Barang(int id, String nama, int hargaJual, int hargaProduksi){
        this.id = id;
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
    }

    public void print(){
        System.out.println("Id : "+id);
        System.out.println("Nama Barang : "+nama);
        System.out.println("Harga Produksi : "+hargaProduksi);
        System.out.println("Harga Jual : \n"+hargaJual);
    }

    public static void main(String args[]){
        Barang brg;
        brg = new Barang(1,"Tisu", 20, 50);
        brg = new Barang(1,"Tisu", 20, 50);
        brg.print();
    }
}
