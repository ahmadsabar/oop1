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
public class Perwalian {
    String mahasiswa= "";
      String prodi = "";
      int npm; 
      int semester;



      void isi (){
      	Scanner in = new Scanner(System.in);

      	System.out.println( " ############# FORM PERWALIAN MAHASISWA ###########");
      	System.out.print(" Nama Mahasiswa       : "+ mahasiswa );
      	mahasiswa= in.next();
      	System.out.print( " NPM                 :" + npm);
      	npm = in.nextInt();
      	System.out.print( " Jurusan             :" + prodi);
      	prodi = in.next();
            
                      
                  System.out.println ("Form Perwalian ");
                  System.out.println ();
                  System.out.print ("Masukan Kode Semester 1-2-3-4-5-6-7-8 : ");
                  semester = in.nextInt();
                  System.out.println();
                  System.out.println("|============= Form KRS=============|");
                  System.out.println("|---------------------");
                  System.out.print("| NPM       =                         |");
                  System.out.println(npm);
                  System.out.print("| Nama      =                         |");
                  System.out.println(mahasiswa);
                  System.out.print("| Semester  =                         |");
                  System.out.println(semester);
                  System.out.println();
                  System.out.println();   
                  System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
                  System.out.println("|-----------------------------------|");
                  System.out.println("|===================================|");
                  System.out.println();

      }
}
