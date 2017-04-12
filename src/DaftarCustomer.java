import java.util.HashMap;

/**
 * Created by Rahman on 4/11/2017.
 */
public class DaftarCustomer {
    public HashMap<Integer,Customer> dbCustomer = new HashMap<>();
    public HashMap<Integer,MemberCustomer> dbMemberCustomer = new HashMap<>();

    public void addCustomer(Customer customer){
        dbCustomer.put(customer.id,customer);
    }

    public Customer cariCustomer(int idCustomer){ return dbCustomer.get(idCustomer);}

    public void isiCustomer(){
        Customer customer;
        customer = new Customer(1,"Aulia Rahman","Cimahi");addCustomer(customer);
        customer = new Customer(2,"Benrigo N","Bandung");addCustomer(customer);
        customer = new Customer(3,"M Rahmanda","Bandung");addCustomer(customer);
        customer = new Customer(4,"Zakki M","Bandung");addCustomer(customer);
    }

    public void addMemberCustomer(MemberCustomer memberCustomer){dbMemberCustomer.put(memberCustomer.id,memberCustomer);}
    public MemberCustomer cariMemberCustomer(int idMemberCustomer){return dbMemberCustomer.get(idMemberCustomer);}

    public void isiMemberCustomer(){
        MemberCustomer memberCustomer;
        memberCustomer = new MemberCustomer(1,"Aulia Rahman","Cimahi",0.25);addMemberCustomer(memberCustomer);
        memberCustomer = new MemberCustomer(2,"Benrigo N","Bandung",0.25);addMemberCustomer(memberCustomer);
        memberCustomer = new MemberCustomer(3,"M Rahmanda","Bandung",0.25);addMemberCustomer(memberCustomer);
        memberCustomer = new MemberCustomer(4,"Zakki M","Bandung",0.25);addMemberCustomer(memberCustomer);
    }

    public void printCustomer(){
        for (Customer customer:dbCustomer.values()){
            System.out.println("Nama : "+customer.nama);
        }
        for (MemberCustomer memberCustomer:dbMemberCustomer.values()){
            System.out.println("Alamat : "+memberCustomer.alamat);
        }
    }

    public static void main(String[] args){
        DaftarCustomer daftarCustomer = new DaftarCustomer();
        daftarCustomer.isiCustomer();
        daftarCustomer.isiMemberCustomer();
        Customer customer = daftarCustomer.cariCustomer(2);
        customer.print();
        MemberCustomer memberCustomer = daftarCustomer.cariMemberCustomer(3);
        memberCustomer.print();
    }
}
