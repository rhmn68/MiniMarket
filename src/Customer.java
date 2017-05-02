import java.util.HashMap;

/**
 * Created by Rahman on 4/5/2017.
 */
//INISIALISASI CUSTOMER
public abstract class Customer {
    int id;
    String nama;
    String alamat;
    boolean diskon;

    public Customer(int id, String nama, String alamat, boolean diskon){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.diskon = diskon;
    }

    public void print(){
        System.out.println("id : "+id);
        System.out.println("nama : "+nama);
        System.out.println("alamat : "+alamat);
        System.out.println("diskon : "+diskon);

    }
}
