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
class Akademik {
    Scanner scan = new Scanner (System.in);
    String nama ;
    String no_reg ;
    int n_akhir ;
    void informasi(){

    System.out.println("================================");
    System.out.println("=======  Data Mahasiswa ========");
	System.out.println("");

	System.out.print("Masukan No_Reg      :");
	no_reg = scan.nextLine();
	System.out.print("Masukan Nama        :");
	nama = scan.nextLine();
	System.out.print("Masukan Nilai Test  :");
    n_akhir = scan.nextInt();
    
    
    if (n_akhir >= 70 && n_akhir <=100 ){
            System.out.println(" Selamat anda Lulus Dengan NIM 15 123 "+no_reg );
        }
    else {
            System.out.println("Maaf anda Tidak Lulus");
    System.out.println("=======================================");
	System.out.println("=======================================");

     }



  }

}
