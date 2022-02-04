/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_pmk;
import java.util.Scanner;

/**
 *
 * @author Waldy
 */
public class Program_pmk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String perintah="";
        int pilihan, harga, bayar;
        double total = 0;
        do {
            //tampilkan jenis kendaraan
            System.out.println("Pembayaran parkir");
            System.out.println("1. Sepeda Motor\n2. Mobil");
            
            //input jenis kendaraan
            System.out.println("Masukan jenis kendaraan");
            pilihan = input.nextInt();
            
        switch (pilihan){
            case 1 : System.out.println("Sepeda Motor");
                     System.out.println("siapkan uang anda!!!");
                     harga = 2000;
                     System.out.println("Biaya parkir = "+harga);
                     
                     total = total + harga;
                     System.out.println("apakah anda mau mengulangi pembayaran parkir? (Y/N");
                     perintah = input.next();
                     
            break;
            case 2 : System.out.println("Mobil");
                     System.out.println("siapkan uang anda!!!");
                     harga = 5000;
                     System.out.println("Biaya parkir = "+harga);
                     
                     total = total + harga;
                     System.out.println("apakah anda mau mengulangi pembayaran parkir? (Y/N");
                     perintah = input.next();                     
                    }
                    }while (perintah.equalsIgnoreCase("Y"));
                    System.out.println("..............................");
                    System.out.println("Terima kasih atas kunjungannya");
                    System.out.println("Silakan datang kembali");
                    System.out.println("Hati-hari di jalan");
                    System.out.println("..............................");
                    System.out.println("Program By Waldy");
                    System.out.println("#ANAK SISTEM INFORMASI");
                    System.out.println("==============================");
           {
        }       
    }
}

