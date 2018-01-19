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
public class Pmb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner (System.in);
        int pilih;

        System.out.println("");
        System.out.println("##############################################");
        System.out.println("#                                          #");
        System.out.println("# SELAMAT DATANG DI APLIKASI AKADEMIK STTB #");
        System.out.println("#                                          #");
        System.out.println("##############################################");
        System.out.println("");
        System.out.println(" MENU ");
        System.out.println("");
        System.out.println(" 1. Pendaftaran");
        System.out.println(" 2. Perwalian");
        System.out.println(" 3. Keluar");
        System.out.println("");
        System.out.println(" SILAHKAN MASUKAN PILIHAN ANDA [1/2/3]  :");
        pilih = in.nextInt();

        switch (pilih){
            case 1:
                    Pendaftaran formulir = new Pendaftaran();
                    formulir.daftar();
                break;
            
            case 2:
                Perwalian wali = new Perwalian();
                wali.isi();
            
            case 3:
                System.exit(0);
            System.out.println(" warning !! Pilihan anda tidak tersedia!!");

        }
    }
    
}
