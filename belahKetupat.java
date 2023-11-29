// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;

public class belahKetupat {
    static void oprasiBelahKetupat(){
        Scanner inputNilai = new Scanner(System.in);
        int d1, d2, luas;
        System.out.println("Masukan nilai d1 : ");
        d1 = inputNilai.nextInt();
        System.out.println("Masukan nilai d2 : ");
        d2 = inputNilai.nextInt();
        luas = d1 * d2 / 2;
        System.out.println("Luas belah ketupat : " + luas + "cm²");
        inputNilai.close();
    }
}
