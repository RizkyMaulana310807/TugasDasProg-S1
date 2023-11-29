// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;

public class Matematika {
    static void oprasiMatematika(){
        System.out.println("-=-=-=-=-=- Selamat daatang di Menu Kalkulator -=-=-=-=-=-");
        double nilaiPertama;
        double nilaiKedua;
        System.out.println("Masukan pilihan operator matematika : \n" + "- = Pengurangan\n" + "+ = Pertambahan\n" + "/ = Pembagian\n" + "* = Perkalian");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan oprator matematika : ");
        char pilihan = input.next().charAt(0);

        System.out.print("Masukan nilai peratama : ");
        nilaiPertama = input.nextDouble();

        System.out.print("Masukan nilai kedua : ");
        nilaiKedua = input.nextDouble();
        
        double hasilPerkalian, hasilPertambahan, hasilPembagian, hasilPengurangan;

        if (pilihan == '-'){
            hasilPengurangan = nilaiPertama - nilaiKedua;
            System.out.println("Hasil pengurangan : " + hasilPengurangan);
        } else if(pilihan == '+'){
            hasilPertambahan = nilaiPertama + nilaiKedua;
            System.out.println("Hasil pertambahan : " + hasilPertambahan);
        } else if(pilihan == '/'){
            if(nilaiKedua == 0){
                System.out.println("Nilai tidak boleh kosong ");
            } else{
                hasilPembagian = nilaiPertama / nilaiKedua;
                System.out.println("Hasil pembagian : " + hasilPembagian);
            }
        } else if(pilihan == '*'){
            hasilPerkalian = nilaiPertama * nilaiKedua;
            System.out.println("Hasil perkalian : " + hasilPerkalian);
        } else{
            System.out.println("Operator belum disediakan");
        }
        input.close();
    }
}
