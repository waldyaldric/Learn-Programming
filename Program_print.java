/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_print;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Program_print {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kertas;
        String tipe;
        int lembar;
        int harga;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jenis printer yang ingin anda gunakan 1. Hitam 2. Warna 3. Gambar ");
        tipe = input.nextLine();
        if ("Hitam".equalsIgnoreCase(tipe))
        {
            System.out.println("Masukan Tipe Kertas 1. A4 2. F4");
            kertas = input.nextLine();
            if ("A4".equalsIgnoreCase(kertas))
            {            
                System.out.println("Masukkan Jumlah Lembar Yang ingin anda print");
                lembar = input.nextInt();          
                if (lembar <= 50) 
                   {
                       
                       harga = 1000 * lembar;
                       System.out.println("Total pembayaran anda ="+ harga);
                   }                      
          else 
         {
             harga = 750 * lembar ;
             System.out.println("Total pembayaran anda ="+ harga);
         }
        }
        else if ("F4".equalsIgnoreCase(kertas))
        {
            System.out.println("Masukan Tipe Kertas 1. A4 2. F4");
         kertas = input.nextLine();
         if ("A4".equalsIgnoreCase(kertas))
         {
             System.out.println("Masukkan Jumlah Lembar Yang ingin anda print");
             lembar = input.nextInt();
             if (lembar <= 30)
             {
                 harga = 1500 * lembar ;
                    System.out.println("Total pembayaran anda ="+ harga);
             }
             else
             {
                 harga = 1100 * lembar ;
                    System.out.println("Total pembayaran anda ="+ harga);
             }
         }
          else if ("F4".equalsIgnoreCase(kertas))
          {
              System.out.println("Masukkan Jumlah Lembar Yang ingin anda print");
             lembar = input.nextInt();
              if (lembar <= 30)
              {
                  harga = 1750 * lembar ;
                  System.out.println("Total pembayaran anda ="+ harga);
              }
              else
              {
                  harga = 1550 * lembar ;
                  System.out.println("Total pembayaran anda ="+ harga);
              }
          }
        }
        else if ("Gambar".equalsIgnoreCase(tipe))
        {
            System.out.println("Masukan Tipe Kertas 1. A4 2. F4");
            kertas = input.nextLine();
            if ("A4".equalsIgnoreCase(kertas))
            {
                System.out.println("Masukkan Jumlah Lembar Yang ingin anda print");
                lembar = input.nextInt();
                if (lembar <= 50)
                {
                    harga = 2000 * lembar ;
                    System.out.println("Total pembayaran anda ="+ harga);
                }
                else
                {
                     harga = 1700 * lembar ;
                    System.out.println("Total pembayaran anda ="+ harga);
                }
            }
            else if ("F4".equalsIgnoreCase(kertas))
            {
                System.out.println("Masukkan Jumlah Lembar Yang ingin anda print");
                lembar = input.nextInt();
                if (lembar <= 50)
                {
                    harga = 2250 * lembar ;
                    System.out.println("Total pembayaran anda ="+ harga);
                }
                else
                {
                    harga = 2100 * lembar ;
                    System.out.println("Total pembayaran anda ="+ harga);
                }
            }
        }
    }
  }
}
                        
                                                             
                
            
    