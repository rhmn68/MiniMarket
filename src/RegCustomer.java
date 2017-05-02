/**
 * Created by Zakki Mudhoffar on 5/2/2017.
 */
public class RegCustomer extends Customer{

    public RegCustomer(int id, String nama, String alamat, boolean diskon) {
        super(id, nama, alamat, diskon);
    }

    public void print(){
        System.out.println("id : "+id);
        System.out.println("nama : "+nama);
        System.out.println("alamat : "+alamat);
        System.out.println("diskon : "+diskon);
    }
    public static void main(String args[]){
        RegCustomer customer = new RegCustomer(1,"Aulia Rahman", "Cimohay,", false);
        customer.print();
    }
}
