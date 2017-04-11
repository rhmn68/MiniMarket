import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Created by Rahman on 4/5/2017.
 */
public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args){
        int menu;
//        do {
//            Scanner in = new Scanner(System.in);
//           System.out.println("=============================");
//           System.out.println("1. Customer");
//           System.out.println("2. Supplier");
//           System.out.println("3. Gudang");
//           System.out.println("4. Kasir");
//           System.out.println("=============================");
//           System.out.println("Masukan Pilihan : ");
//           menu = in.nextInt();
//           switch (menu){
//               case 1:{
//                   System.out.println("ceksa");
//               }
//           }
//        }while (menu!=0);
        String fn = JOptionPane.showInputDialog("Enter First Number ?");
        String sn = JOptionPane.showInputDialog("Enter Second Number ?");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The Answer Is : "+sum, "YESSA",JOptionPane.PLAIN_MESSAGE);
    }
}
