// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;

public class trapesium {
    static void oprasiTrapesium(){
        Scanner inputNilai = new Scanner(System.in);
        int luas,tinggi,a,b;
        System.out.println("Masukan nilai a : ");
        a = inputNilai.nextInt();
        System.out.println("Masukan nilai b : ");
        b = inputNilai.nextInt();
        System.out.println("Masukan tinggi : ");
        tinggi = inputNilai.nextInt();
        luas = a + b / 2;
        int hasilLuas = luas * tinggi;
        System.out.println("Luas trapesium : " + hasilLuas + "cm²");
        inputNilai.close();
    }
}
