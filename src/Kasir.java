/**
 * Created by benrigonovan on 02-May-17.
 */
public class Kasir extends Pegawai {

    public Kasir(int id, String nama, String alamat, int gaji, double tunjangan) {
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
        System.out.println("Gaji Kasir: "+hitungGaji());
    }

    public static void main(String[] args){
        Kasir k = new Kasir(2,"Novansar","Bandung",250000,0.10);
        k.print();
    }
}
