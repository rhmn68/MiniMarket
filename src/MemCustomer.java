/**
 * Created by Zakki Mudhoffar on 5/2/2017.
 */
public class MemCustomer extends Customer{

    public MemCustomer(int id, String nama, String alamat, boolean diskon) {
        super(id, nama, alamat, diskon);
    }

    public void print(){
        System.out.println("id : "+id);
        System.out.println("nama : "+nama);
        System.out.println("alamat : "+alamat);
        System.out.println("diskon : "+diskon);
    }
    public static void main(String args[]){
        MemCustomer customer = new MemCustomer(1,"Aulia Rahman", "Cimohay,", true);
        customer.print();
    }
}
