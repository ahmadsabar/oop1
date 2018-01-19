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
public class Pendaftaran {
    
    String nama = "";
    String alamat = "";
    String tempat_lahir = "";
    String bulan_lahir= "";
    String agama = "";
    String jenis_kelamin = "";
    String asal_sekolah = "";
    String jurusan = "";
    String no_registrasi = "";
    String biaya;
    Prodi prodi = new Prodi();
    int tanggal  ;
    int tahun_lahir ;
    int tahun_lulus  ;
    Bayar bayar = new Bayar();
    boolean status = false;

    
    void daftar(){
         Scanner keyboard = new Scanner (System.in);              
        // tampilkan ke user
        System.out.println("######################## FORM PENDAFTARAN MAHASISWA BARU ############################");
        System.out.print(" Nama                     :" + nama);
        nama = keyboard.next();
        System.out.print(" Alamat                   :" + alamat);
        alamat = keyboard.next();
        System.out.print(" Tanggal lahir            :" + tanggal);
        tanggal = keyboard.nextInt();
        System.out.print(" Tempat lahir             :" + tempat_lahir);
        tempat_lahir = keyboard.next();
        System.out.print(" Bulan Lahir              :" + bulan_lahir); 
        bulan_lahir = keyboard.next();
        System.out.print(" Tahun Lahir              :" + tahun_lahir);
        tahun_lahir = keyboard.nextInt();
        System.out.print(" Agama                    :" + agama);
        agama = keyboard.next();
        System.out.print(" Jenis Kelamin            :" + jenis_kelamin);
        jenis_kelamin = keyboard.next();
        System.out.print(" Asal Sekolah SMA / SMK   :" + asal_sekolah);
        asal_sekolah = keyboard.next();
        System.out.print(" Tahun Lulus              :" + tahun_lulus);
        tahun_lulus = keyboard.nextInt();
        System.out.print(" Jurusan yang di pilih    :" + jurusan);
        jurusan = keyboard.next();
         
        prodi.pilihjurusan();
        System.out.print("#####################################################################################");
        
        
    }
}
