// @autohor Rizky Maulana X-Oracle
import java.util.Scanner;

public class main {
    static double hasilPerkalian, hasilPertambahan, hasilPembagian, hasilPengurangan;
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        char pilihan;
        System.out.println(" =-=-=- Selamat datang di menu -=-=-=");
        System.out.println(" 1.Kalkulator\n 2.Perulangan\n 3.ifKondisi\n 4.Konfersi Suhu\n 5.Bangun Datar\n 6.keluar\n");
        System.out.print("Masukan Pilihan anda : ");
        pilihan = inputUser.next().charAt(0);
        System.out.println("");
        if (pilihan == '1') {
            System.out.println("Memilih pilihan 1");
            Kalkulator();
        } else if (pilihan == '2') {
            System.out.println("Memilih pilihan 2");
            mengulang();
        } else if (pilihan == '3') {
            System.out.println("Memilih pilihan 3");
            mengecekKondisi();
        } else if (pilihan == '4') {
            System.out.println("Memilih pilihan 4");
            mengkonfersiSuhu();
        } else if (pilihan == '5') {
            System.out.println("Memilih pilihan 5");
            menghitungBangunDatar();
        } else if(pilihan == '6'){
            System.exit(0);
        }

        inputUser.close();
    }

    static void Kalkulator() {
        Matematika mtk = new Matematika();
        mtk.oprasiMatematika();
    }
    static void mengkonfersiSuhu(){
        konfersiSuhu suhu = new konfersiSuhu();
        suhu.oprasiSuhu();
    }
    static void mengecekKondisi(){
        ifKondisi kondisi = new ifKondisi();
        kondisi.oprasiKondisi();
    }
    static void mengulang(){
        Perulangan loop = new Perulangan();
        loop.oprasiPengulangan();
    }
    static void menghitungBangunDatar(){
        Scanner bdtr = new Scanner(System.in);
        System.out.println("Masukan input sesuai menu");
        char pilihanBangunDatar;
        System.out.println("Pilihan\n 1.Jajar genjang\n 2.Lingkaran\n 3.Persegi Panjang\n 4.Segi Tiga\n 5.Trapesium\n 6.Belah Ketupat\n");
        pilihanBangunDatar = bdtr.next().charAt(0);
        if(pilihanBangunDatar == '1'){
            JajarGenjang opjjr = new JajarGenjang();
            opjjr.oprasiJajarGenjang();
        } else if(pilihanBangunDatar == '2'){
            lingkaran opl = new lingkaran();
            opl.oprasiLingkaran();
        } else if(pilihanBangunDatar == '3'){
            PersegiPanjang opp = new PersegiPanjang();
            opp.oprasiPersegiPanjang();
        } else if(pilihanBangunDatar == '4'){
            segiTiga opst = new segiTiga();
            opst.oprasiSegiTiga();
        } else if(pilihanBangunDatar == '5'){
            trapesium optr = new trapesium();
            optr.oprasiTrapesium();
        } else if(pilihanBangunDatar == '6'){
            belahKetupat opbk = new belahKetupat();
            opbk.oprasiBelahKetupat();
        }
    }
}