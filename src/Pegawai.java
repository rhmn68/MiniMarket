/**
 * Created by benrigonovan on 02-May-17.
 */
public abstract class Pegawai {

    public int id;
    public String nama;
    public String alamat;
    public int gaji;
    public double tunjangan;

    public Pegawai(int id, String nama, String alamat, int gaji, double tunjangan) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    public double hitungGaji(){
        return 0;
    }
}
