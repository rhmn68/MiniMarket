import java.util.HashMap;

/**
 * Created by Rahman on 4/10/2017.
 */
public class BarangPajang {
    private HashMap<Integer,Barang> ArrBarang = new HashMap<>(); //Menambah Barang ke ArrBarang

    public void addBarang(Barang brg){
        ArrBarang.put(brg.id,brg);
    }

    public void addBarang(){
        addBarang(new Barang(1, "Tisu",20,15));
        addBarang(new Barang(2, "Kawat",50,40));
        addBarang(new Barang(3, "Tembaga",100,90));
    }

    public Barang cari(int brgId){
        return ArrBarang.get(brgId);
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
        HashMap<Integer,Barang> ArrBarang = new HashMap<>(); //Menambah Barang ke ArrBarang
        BarangPajang brgPajang = new BarangPajang();
        brgPajang.addBarang();
        brgPajang.print();
    }
}
