/**
 * Created by Rahman on 4/11/2017.
 */
public class MemberCustomer extends Customer{
    double diskon;

    public MemberCustomer(int id, String nama, String alamat, double diskon) {
        super(id, nama, alamat);
        this.diskon = diskon;
    }

    @Override
    public void print(){
        System.out.println("Id = "+id);
        System.out.println("Nama = "+nama);
        System.out.println("Alamat = "+alamat);
        System.out.println("Diskon = "+diskon);
    }

    public static void main(String[] args){
        MemberCustomer memberCustomer = new MemberCustomer(1,"Rahman","Cimahi",0.25);
        memberCustomer.print();
    }

}
