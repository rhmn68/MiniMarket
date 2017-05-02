import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Muhammad Rahmanda on 18-Apr-17.
 */
public class BarangPajang {
    private HashMap<Integer,Barang> ArrBarang = new HashMap<>(); //Menambah Barang ke ArrBarang

    public void addBarang(Barang brg){
        ArrBarang.put(brg.id,brg);
    }

    public Barang cariBarang(int brgId){
        return ArrBarang.get(brgId);
    }

    public void isiBarang(){
        Barang barang;
        barang = new Barang(1,"Tisu",4500,4000);addBarang(barang);
        barang = new Barang(2,"Sabun",3500,2900);addBarang(barang);
    }

    public void print(){
        for (Barang brg:ArrBarang.values()){
            System.out.println("Nama Barang : "+brg.nama);
            System.out.println("Harga Jual  : "+brg.hargaJual);
        }
    }

    public void isi(){
        Barang barang;
        barang = new Barang(1,"Tisu",5000,4500);addBarang(barang);
        barang = new Barang(2,"Kawat",10000,9000);addBarang(barang);
        barang = new Barang(3,"Tembaga",6000,5000);addBarang(barang);
        barang = new Barang(4,"Solar",20000,15000);addBarang(barang);
    }

    public static void main(String[] args){
        BarangPajang brgPajang = new BarangPajang();
        brgPajang.isiBarang();
        brgPajang.print();
        Barang brg = brgPajang.cariBarang(2);

    }
}
