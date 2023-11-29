// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;

public class segiTiga {
   static void oprasiSegiTiga(){
      Scanner inputNilai = new Scanner(System.in);
    int alas, tinggi, luas;
    System.out.println("Masukan alas segi tiga : ");
    alas = inputNilai.nextInt();
    System.out.println("Masukan tinggi segi tiga : ");
    tinggi = inputNilai.nextInt();
    luas = alas * tinggi / 2;
    System.out.println("luas segi tiga : " + luas + "cm²");
    inputNilai.close();
   }
}
