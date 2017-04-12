import java.util.HashMap;

/**
 * Created by Rahman on 4/10/2017.
 */
public class BarangPajang {
    private HashMap<Integer,Barang> ArrBarang = new HashMap<>(); //Menambah Barang ke ArrBarang

    public void addBarang(Barang brg){
        ArrBarang.put(brg.id,brg);
    }

    public Barang cari(int brgId){
        return ArrBarang.get(brgId);
    }

    public void addBarang(){
        Barang barang;
        barang = new Barang(1,"Tisu",50,20);addBarang(barang);
        barang = new Barang(2,"Tisu",50,20);addBarang(barang);
    }

    public void print(){
        for (Barang brg:ArrBarang.values()){
            System.out.println("ID : "+brg.id);
            System.out.println("Nama Barang : "+brg.nama);
            System.out.println("Harga Jual : "+brg.hargaJual);
            System.out.println("Harga Produksi : "+brg.hargaProduksi);
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        BarangPajang brgPajang = new BarangPajang();
        brgPajang.addBarang();
        Barang brg = brgPajang.cari(2);
        brg.print();
    }
}
