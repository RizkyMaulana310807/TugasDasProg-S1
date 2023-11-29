// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;
public class Perulangan {
    static void oprasiPengulangan(){
        System.out.println("Selamat datang di oprasi pengulangan");
        Scanner inputUser = new Scanner(System.in);
        int masukan;
        System.out.println("Silahkan pilih oprasi pengulangan\n 1.for\n 2.while\n 3.doWhile\n");
        masukan = inputUser.nextInt();
        switch (masukan) {
            case 1:
            System.out.println("=-=-=- Soal 1 -=-=-=");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=-=-=- Soal 2 -=-=-=");
        System.out.println("");
        System.out.print("  *"); //alternatif
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 2 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=-=-=- Soal 3 -=-=-=");
        System.out.println("");
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <=1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=-=-=- Soal 4 =-=-=-");
        System.out.println("");
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
                break;
            case 2:
            //Perulangan menggunakan While
        System.out.println("");
        System.out.println("|| While perulangan ||");
        int k = 1;
        while (k <= 100) {
            System.out.print(k + ", ");
            k += 2;
        }
        System.out.println("");
        System.out.println("|| While perulangan ||");
        int l = 2;
        while (l <= 100) {
            System.out.print(l + ", ");
            l += 2;
        }
        System.out.println("");
                break;
            case 3:
            //Perulangan menggunakan do while
        System.out.println("|| Do While Perulangan ||");
        int i = 1;
        do {
            System.out.print(i + ", ");
            i += 2;
        } while (i <= 100);
        System.out.println("");
        System.out.println("|| Do While perulangan ||");
        
        int j = 2;
        do{
            System.out.print(j + ", ");
            j += 2;
        } while (j <= 100);
        System.out.println("");
                break;
            default:
                break;
        }
    }
}
