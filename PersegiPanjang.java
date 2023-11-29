// @autohor Rizky Maulana X-Oracle
public class PersegiPanjang {
    static void oprasiPersegiPanjang(){
        //Rumus Persegi Panjang
        int panjang,luas,lebar;
        panjang = 2;
        lebar = 4;
        luas = panjang * lebar;
        int p;
         p = luas / lebar;
        System.out.println("Hasil p = " + p);
        int l;
        l = luas / panjang;
        System.out.println("Hasil l = " + l);
        System.out.println("Hasil Rumus Luas Persegi Panjang = " + luas);
        //Rumus keliling Persegi Panjang
        int keliling;
        keliling = 2 * (panjang + lebar);
        System.out.println("Hasil rumus keliling persegi panjang = "+ keliling + "cm²");
    }
}
