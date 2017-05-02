/**
 * Created by benrigonovan on 02-May-17.
 */
public class Manager extends Pegawai {


    public Manager(int id, String nama, String alamat, int gaji, double tunjangan) {
        super(id, nama, alamat, gaji, tunjangan);
    }

    @Override
    public double hitungGaji(){
        double total;
        tunjangan = tunjangan*gaji;
        total = gaji + tunjangan;
        return total;

    }

    public void print(){
        System.out.println("Gaji Manager: "+hitungGaji());
    }

    public static void main(String[] args){
        Manager m = new Manager(1,"Benrigo","Bandung",500000,0.20);
        m.print();
    }
}
