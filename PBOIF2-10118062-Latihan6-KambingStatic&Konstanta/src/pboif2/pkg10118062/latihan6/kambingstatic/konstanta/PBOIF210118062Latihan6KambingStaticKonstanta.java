/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan6.kambingstatic.konstanta;

/**
 *
 * @author 
 * Nama     : Muhammad Dandri Handian
 * Kelas    : IF-2
 * NIM      : 10118062
 */
public class PBOIF210118062Latihan6KambingStaticKonstanta {

    /**
     * @param args the command line arguments
     */
    // Variabel jumlahKambing dideklarisasikan sebagai statik
    public static int jumlahKambing;


public class KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta
      public static final String NAMA_KAMBING = "MIDUN";
}
      public static void main(String[] arg) {
          PBOIF210118062Latihan6KambingStaticKonstanta.jumlahKambing = 485000;
        String NAMA_KAMBING = "Midun";
          System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                             + PBOIF210118062Latihan6KambingStaticKonstanta.jumlahKambing);
   
        // TODO code application logic here
    }
    
}
