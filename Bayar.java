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
class Bayar {
    String biaya;
    Akademik akademik = new Akademik();

    void pembayaran() {
        Scanner scan = new Scanner (System.in);

	System.out.print("Masukan Biaya Pendaftaran :");
	biaya = scan.nextLine();
    
    System.out.println(" Transaksi telah Berhasil ");

    akademik.informasi();

    }

    
}
