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
        barang = new Barang(1,"Tisu",5000,4500);addBarang(barang);
        barang = new Barang(2,"Kawat",10000,9000);addBarang(barang);
        barang = new Barang(3,"Tembaga",6000,5000);addBarang(barang);
        barang = new Barang(4,"Solar",20000,15000);addBarang(barang);
    }

    public void print(){
        System.out.println("==================================");
        System.out.println("          DAFTAR BARANG");
        System.out.println("==================================");
        System.out.println("Id  Nama Barang            Harga");
        for (Barang brg:ArrBarang.values()){
            System.out.printf("%d",brg.id);
            System.out.printf("%10s",brg.nama);
            System.out.printf("%20d\n",brg.hargaJual);
        }
        System.out.println("==================================");
    }

    public static void main(String[] args){
        BarangPajang brgPajang = new BarangPajang();
        brgPajang.isiBarang();
        Barang brg = brgPajang.cariBarang(2);
        brg.print();
//        brgPajang.print();
    }
}
