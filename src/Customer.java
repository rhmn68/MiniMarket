import java.util.HashMap;

/**
 * Created by Rahman on 4/5/2017.
 */
//INISIALISASI CUSTOMER
public class Customer {
    public int id;
    String nama;
    String alamat;

    public  Customer(int id, String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void print(){
        System.out.println("Id = "+id);
        System.out.println("Nama Customer = "+nama);
        System.out.println("");
    }
    public static void main(String args[]){
        Customer customer = new Customer(1,"Aulia Rahman", "Cimohay");
        customer.print();
    }
}
