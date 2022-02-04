/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_pinjaman;
import java.util.Scanner;
/**
 *
 * @author waldy
 */
public class Program_pinjaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        int pinjman;
        int Tanggal;
        
        Scanner input = new Scanner (System.in); 
        System.out.println("Masukan jumlah pinjman anda");
        pinjman = input.nextInt();
        System.out.println("Tanggal pembayaran pinjman anda");
        Tanggal = input.nextInt();
        
        if ( Tanggal <= 24){
        System.out.println("Anda mendapatkan pengembalian dana 10%");        
        } else if ( Tanggal >= 26 && Tanggal <= 31 ){
        System.out.println("Anda mendapatkan biaya tambahan keterlambatan 5%/bulan");
        } else if ( Tanggal >= 24 && Tanggal <=25 ){
        System.out.println("Biaya pinjaman normal");       
        } 
                   
    }
    
}
