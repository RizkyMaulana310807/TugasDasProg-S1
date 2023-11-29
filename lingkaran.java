// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;

public class lingkaran {
    static void oprasiLingkaran(){
        Scanner inputNilai = new Scanner(System.in);
        double keliling,phi,jariJari,luas,diameter;
        phi = 3.14;
        System.out.println("Masukan jari-jari : ");
        jariJari = inputNilai.nextInt();
        System.out.println("Masukan diameter : ");
        diameter = inputNilai.nextInt();
        luas = phi * jariJari * jariJari;
        System.out.println("Luas Lingkaran : " + luas);
        keliling = phi * diameter;
        System.out.println("Keliling lingkaran : " + keliling + "cm²");
        inputNilai.close();
    }
}
