import java.util.Scanner;

public class konfersiSuhu {
    static void oprasiSuhu(){
        Scanner input = new Scanner(System.in);
        char pilihanPertama;
        char pilihanKedua;
        double nilaiPertama;
        double hasilCelcius, hasilFahrenheit, hasilKelvin, hasilReamur;
        
        
        System.out.println("!!! Input harus berupa huruf kapital !!!");
        System.out.println("Pilih Konfersi Suhu berikut ini : \n" + "Reamur : 'R' \n" + "Kelvin : 'K' \n" + "Celcius : 'C' \n" + "Fahrenheit : 'F' \n");
        System.out.print("Masukan pilihan awal : ");
        pilihanPertama = input.next().charAt(0);
        System.out.print("Masukan pilihan kedua : ");
        pilihanKedua = input.next().charAt(0);
        System.out.print("Masukan Nilai " + pilihanPertama + " : ");
        nilaiPertama = input.nextDouble();

        

        if(pilihanPertama == 'C' && pilihanKedua == 'R'){
            hasilReamur = (4.0 / 5.0) * nilaiPertama;
            System.out.print("Hasil konfersi suhu dari Celcius ke Reamur Adalah : " + hasilReamur + "\n");
        } else if(pilihanPertama == 'C' && pilihanKedua == 'F' ){
            hasilFahrenheit = (9.0 / 5.0 ) * nilaiPertama + 32;
            System.out.print("Hasil konfersi suhu dari Celcius ke Fahrenheit Adalah : " + hasilFahrenheit + "\n");
        } else if(pilihanPertama == 'C' && pilihanKedua == 'K' ){
            hasilKelvin =  nilaiPertama + 273.15;
            System.out.print("Hasil konfersi suhu dari Celcius ke Kelvin Adalah : " + hasilKelvin + "\n");
        } else if(pilihanPertama == 'R' && pilihanKedua == 'C'){
            hasilCelcius = (5.0 / 4.0) * nilaiPertama;
            System.out.print("Hasil konfersi suhu dari Reamur ke Celcius Adalah : " + hasilCelcius + "\n");
        } else if(pilihanPertama == 'R' && pilihanKedua == 'F'){
            hasilFahrenheit = (9.0 / 4.0) * nilaiPertama + 32.0;
            System.out.print("Hasil konfersi suhu dari Reamur ke Fahrenheit Adalah : " + hasilFahrenheit + "\n");
        } else if(pilihanPertama == 'R' && pilihanKedua == 'K'){
            hasilKelvin = (5.0 / 4.0) * nilaiPertama + 273.15;
            System.out.print("Hasil konfersi suhu dari Reamur ke Kelvin Adalah : " + hasilKelvin + "\n");
        } else if(pilihanPertama == 'F' && pilihanKedua == 'C'){
            hasilCelcius = (5.0 / 9.0) * (nilaiPertama - 32);
            System.out.print("Hasil konfersi suhu dari Fahrenheit ke Celcius Adalah : " + hasilCelcius + "\n");
        } else if(pilihanPertama == 'F' && pilihanKedua == 'R'){
            hasilReamur = (4.0 / 9.0) * (nilaiPertama - 32);
            System.out.print("Hasil konfersi suhu dari Fahrenheit ke Reamur Adalah : " + hasilReamur + "\n");
        } else if(pilihanPertama == 'K' && pilihanKedua == 'C'){
            hasilCelcius = nilaiPertama - 273;
            System.out.print("Hasil konfersi suhu dari Kelvin ke Celcius Adalah : " + hasilCelcius + "\n");
        } else if(pilihanPertama == 'K' && pilihanKedua == 'R'){
            hasilReamur = (4.0 / 5.0) * (nilaiPertama - 273);
            System.out.print("Hasil konfersi suhu dari Kelvin ke Reamur Adalah : " + hasilReamur + "\n");
        } else{
            System.out.println("--! Peringatan !--\n" + "Pilihan tidak sesuai");
            
        }






        input.close();
    }
}
