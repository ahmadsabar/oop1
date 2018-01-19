/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmb2;
import java.util.Scanner;
/**
 *
 * @author ABAYSH
 */
class Prodi {

   Scanner scan = new Scanner (System.in);
    int jurus;
    String jawab;
    Bayar bayar = new Bayar();
    void pilihjurusan(){
    

 System.out.println("=======   Pilih Jurusan                =======");
 System.out.println("====  1. Teknik Informatika               ====");
 System.out.println("====  2. Teknik Industri                  ====");
 System.out.println("====  3. Tehnik Desain Komunikasi Visual  ====");
 System.out.println("===============================================");
 System.out.print("Masukkan Pilihan Anda : ");
 jurus = scan.nextInt();

 switch ( jurus ){

case 1 :
        System.out.println(" Anda Memilih Prodi tehnik informatika");
        System.out.println("====== Biaya yang harus di bayar ====== ");
        System.out.println(" Biaya Spb 1               = Rp.  50.000");
        System.out.println(" Biaya Spp 1               = Rp. 350.000");
        System.out.println("Jaket Almamater            = Rp. 100.000");
        System.out.println(" ---------------------------------------- + ");
        System.out.println("Total yang harus dibayarkan = Rp. 500.000");
        System.out.println(" Silahkan ikuti test terlebih dahulu");
        System.out.println("========= SOAL TEST ============");
        System.out.println(" yang termasuk alat input =         ");
        System.out.println("a. scaner   b.monitor   c.keyboard  ");
        System.out.println (" jawaban anda = ");
        jawab = scan.nextLine();
        System.out.println("");
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }

    break;

case 2 :
        System.out.println(" Anda Memilih Prodi Tehnik Industri");
        System.out.println("====== Biaya yang harus di bayar ====== ");
        System.out.println(" Biaya Spb 1               = Rp. 100.000");
        System.out.println(" Biaya Spp 1               = Rp. 350.000");
        System.out.println("Jaket Almamater            = Rp. 100.000");
        System.out.println(" ---------------------------------------- + ");
        System.out.println("Total yang harus dibayarkan = Rp. 550.000");
        System.out.println(" Silahkan ikuti test terlebih dahulu");
        System.out.println("========= SOAL TEST ============");
        System.out.println(" Sebuah persegi pajang memiliki panjang = 8cm dan lebar 5cm.Hitunglah luas persegipanjang tersebut? ");
        System.out.println("a.10 cm   b.40 cm     c.30 cm");
        System.out.println(" Jawaban Anda:");
        jawab = scan.nextLine();
        if(jawab.equals("b")){
            jawab = scan + (" jawaban benar anda mendapatkan nilai 100");
        }

    break;
case 3 :
        System.out.println(" Anda Memilih Prodi Tehnik Industri");
        System.out.println("====== Biaya yang harus di bayar ====== ");
        System.out.println(" Biaya Spb 1               = Rp. 150.000");
        System.out.println(" Biaya Spp 1               = Rp. 350.000");
        System.out.println("Jaket Almamater            = Rp. 100.000");
        System.out.println(" ---------------------------------------- + ");
        System.out.println("Total yang harus dibayarkan = Rp. 600.000");
        System.out.println(" Silahkan ikuti test terlebih dahulu");
        System.out.println("========= SOAL TEST ============");
        System.out.println(" Apa nama lain dari garis lengkung ?");
        System.out.println("a. curve  b.lingkaran c.bundar");
        jawab = scan.nextLine();
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }        
    break;    
        }
    
System.out.println("=== SIlahkan Melakukan Pembayaran melaui Rek BRI :1347-01-001718-50-6 A/N SEKOLAH TINGGI TEKNOLOGI BANDUNG");
System.out.println(" ");

bayar.pembayaran();
System.exit(0);


    }
    
}
